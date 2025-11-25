#include <stdio.h>

// --- Configuration ---
#define NUM_TASKS 3
#define NUM_MACHINES 2
#define LARGE_NUM 99999 // Used as a substitute for "infinity"

// --- Min-Min Algorithm ---
void minMin(int exec_time[NUM_TASKS][NUM_MACHINES])
{
    int machine_ready[NUM_MACHINES] = {0}; // Tracks when each machine is free
    int task_assigned[NUM_TASKS] = {0};    // 0=no, 1=yes
    int assigned_count = 0;

    printf("--- Min-Min Scheduling ---\n");
    printf("Task | Machine | Completion Time\n");
    printf("---------------------------------\n");

    while (assigned_count < NUM_TASKS)
    {
        int best_task = -1;
        int best_machine = -1;
        int min_completion_time = LARGE_NUM;

        // Find the single (task, machine) pair with the
        // absolute minimum completion time from all unassigned tasks
        for (int t = 0; t < NUM_TASKS; t++)
        {
            if (task_assigned[t] == 0)
            { // If task is unassigned
                for (int m = 0; m < NUM_MACHINES; m++)
                {
                    int completion_time = machine_ready[m] + exec_time[t][m];

                    if (completion_time < min_completion_time)
                    {
                        min_completion_time = completion_time;
                        best_task = t;
                        best_machine = m;
                    }
                }
            }
        }

        // Assign the best task found
        machine_ready[best_machine] = min_completion_time;
        task_assigned[best_task] = 1;
        assigned_count++;

        printf("  %d  |    %d    |        %d\n",
               best_task + 1, best_machine + 1, min_completion_time);
    }
}

// --- Max-Min Algorithm ---
void maxMin(int exec_time[NUM_TASKS][NUM_MACHINES])
{
    int machine_ready[NUM_MACHINES] = {0};
    int task_assigned[NUM_TASKS] = {0};
    int assigned_count = 0;

    printf("\n--- Max-Min Scheduling ---\n");
    printf("Task | Machine | Completion Time\n");
    printf("---------------------------------\n");

    while (assigned_count < NUM_TASKS)
    {
        int task_best_time[NUM_TASKS];
        int task_best_machine[NUM_TASKS];

        // Step 1: Find the earliest finish time for EACH unassigned task
        for (int t = 0; t < NUM_TASKS; t++)
        {
            if (task_assigned[t] == 0)
            {
                int min_time = LARGE_NUM;
                int best_m = -1;
                for (int m = 0; m < NUM_MACHINES; m++)
                {
                    int completion_time = machine_ready[m] + exec_time[t][m];
                    if (completion_time < min_time)
                    {
                        min_time = completion_time;
                        best_m = m;
                    }
                }
                task_best_time[t] = min_time;
                task_best_machine[t] = best_m;
            }
            else
            {
                task_best_time[t] = -1; // Mark as already assigned
            }
        }

        // Step 2: Find the task with the MAXIMUM of those earliest times
        int max_of_mins = -1;
        int best_task = -1;
        for (int t = 0; t < NUM_TASKS; t++)
        {
            if (task_assigned[t] == 0 && task_best_time[t] > max_of_mins)
            {
                max_of_mins = task_best_time[t];
                best_task = t;
            }
        }

        // Step 3: Assign that task
        int best_machine = task_best_machine[best_task];
        int completion_time = task_best_time[best_task];

        machine_ready[best_machine] = completion_time;
        task_assigned[best_task] = 1;
        assigned_count++;

        printf("  %d  |    %d    |        %d\n",
               best_task + 1, best_machine + 1, completion_time);
    }
}

// --- Main Function ---
int main()
{
    // Execution time of 3 Tasks on 2 Machines
    //        M1 | M2
    // Task 1 |  5 | 10
    // Task 2 |  2 |  8
    // Task 3 |  7 |  3
    int exec_time[NUM_TASKS][NUM_MACHINES] = {
        {5, 10}, // Task 1
        {2, 8},  // Task 2
        {7, 3}   // Task 3
    };

    // Run Min-Min
    minMin(exec_time);

    // Run Max-Min
    maxMin(exec_time);

    return 0;
}