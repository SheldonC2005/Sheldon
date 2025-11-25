#include <stdio.h>

// Function to find the waiting time for all processes [cite: 16]
void findWaitingTime(int n, int burst_time[], int waiting_time[])
{
    // Waiting time for the first process is 0
    waiting_time[0] = 0;

    // Calculate waiting time for remaining processes
    for (int i = 1; i < n; i++)
    {
        waiting_time[i] = burst_time[i - 1] + waiting_time[i - 1];
    }
}

// Function to calculate turnaround time [cite: 17]
void findTurnAroundTime(int n, int burst_time[], int waiting_time[], int turnaround_time[])
{
    // Calculate turnaround time
    // turnaround_time = burst_time + waiting_time
    for (int i = 0; i < n; i++)
    {
        turnaround_time[i] = burst_time[i] + waiting_time[i];
    }
}

// Function to calculate and display average times [cite: 18]
void findAverageTimes(int n, int burst_time[])
{
    int waiting_time[n], turnaround_time[n];
    int total_waiting_time = 0, total_turnaround_time = 0;

    // Calculate waiting time [cite: 12]
    findWaitingTime(n, burst_time, waiting_time);

    // Calculate turnaround time [cite: 13]
    findTurnAroundTime(n, burst_time, waiting_time, turnaround_time);

    // Display process details [cite: 21]
    printf("--- FCFS Scheduling ---\n");
    printf("Processes   Burst Time   Waiting Time   Turnaround Time\n");

    // Calculate total waiting and turnaround time
    for (int i = 0; i < n; i++)
    {
        total_waiting_time += waiting_time[i];
        total_turnaround_time += turnaround_time[i];
        printf("   P%d \t\t %d \t\t %d \t\t %d\n", (i + 1), burst_time[i], waiting_time[i], turnaround_time[i]);
    }

    // Calculate and display averages [cite: 14]
    printf("\nAverage Waiting Time: %.2f\n", (float)total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", (float)total_turnaround_time / n);
}

// Main function
int main()
{
    // Number of processes [cite: 8]
    int n = 3;

    // Process IDs
    int processes[] = {1, 2, 3}; // [cite: 22]

    // Burst time for each process [cite: 9]
    int burst_time[] = {10, 5, 8}; //

    findAverageTimes(n, burst_time);

    return 0;
}