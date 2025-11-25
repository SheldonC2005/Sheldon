#include <stdio.h>

// A struct to hold process ID and burst time
struct Process
{
    int pid; // Process ID
    int bt;  // Burst Time
};

// Function to sort processes based on burst time (Bubble Sort) [cite: 48]
void sortProcesses(int n, struct Process proc[])
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (proc[j].bt > proc[j + 1].bt)
            {
                // Swap
                struct Process temp = proc[j];
                proc[j] = proc[j + 1];
                proc[j + 1] = temp;
            }
        }
    }
}

// Function to find the waiting time for all processes [cite: 49]
void findWaitingTime(int n, struct Process proc[], int waiting_time[])
{
    // Waiting time for the first (shortest) process is 0
    waiting_time[0] = 0;

    // Calculate waiting time for remaining processes
    for (int i = 1; i < n; i++)
    {
        waiting_time[i] = proc[i - 1].bt + waiting_time[i - 1];
    }
}

// Function to calculate turnaround time [cite: 51]
void findTurnAroundTime(int n, struct Process proc[], int waiting_time[], int turnaround_time[])
{
    // Calculate turnaround time
    // turnaround_time = burst_time + waiting_time
    for (int i = 0; i < n; i++)
    {
        turnaround_time[i] = proc[i].bt + waiting_time[i];
    }
}

// Function to calculate and display average times [cite: 52]
void findAverageTimes(int n, struct Process proc[])
{
    int waiting_time[n], turnaround_time[n];
    int total_waiting_time = 0, total_turnaround_time = 0;

    // Sort processes by burst time [cite: 41]
    sortProcesses(n, proc);

    // Calculate waiting time [cite: 42]
    findWaitingTime(n, proc, waiting_time);

    // Calculate turnaround time [cite: 44]
    findTurnAroundTime(n, proc, waiting_time, turnaround_time);

    // Display process details [cite: 54]
    printf("--- SJF Scheduling ---\n");
    printf("Processes   Burst Time   Waiting Time   Turnaround Time\n");

    // Calculate total waiting and turnaround time
    for (int i = 0; i < n; i++)
    {
        total_waiting_time += waiting_time[i];
        total_turnaround_time += turnaround_time[i];
        printf("   P%d \t\t %d \t\t %d \t\t %d\n", proc[i].pid, proc[i].bt, waiting_time[i], turnaround_time[i]);
    }

    // Calculate and display averages [cite: 45]
    printf("\nAverage Waiting Time: %.2f\n", (float)total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", (float)total_turnaround_time / n);
}

// Main function
int main()
{
    // Number of processes [cite: 37]
    int n = 3;

    // Process details [cite: 55, 56]
    struct Process proc[] = {{1, 10}, {2, 5}, {3, 8}};

    findAverageTimes(n, proc);

    return 0;
}