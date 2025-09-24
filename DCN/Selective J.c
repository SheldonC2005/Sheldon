#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>
#define MAX_FRAME_SIZE 1024
#define MAX_RETRIES 3
#define ACK_SUCCESS_RATE 80
#define TIMEOUT_SECONDS 2
#define WINDOW_SIZE 4
void send_frame(char bit, int frame_number)
{
    printf("Sender: Sending frame %d -> %c\n", frame_number, bit);
}
int receive_frame(char bit, int frame_number)
{
    printf("Receiver: Received frame %d -> %c\n", frame_number, bit);
    int ack_chance = rand() % 100;
    if (ack_chance < ACK_SUCCESS_RATE)
    {
        printf("Receiver: Sending ACK for frame %d\n", frame_number);
        return 1;
    }
    else
    {
        printf("Receiver: ACK for frame %d lost!\n", frame_number);
        return 0;
    }
}
int main()
{
    char data[MAX_FRAME_SIZE];
    int ack_status[MAX_FRAME_SIZE] = {0};
    int retries[MAX_FRAME_SIZE] = {0};
    srand(time(NULL));
    printf("Enter data to send: ");
    fgets(data, MAX_FRAME_SIZE, stdin);
    data[strcspn(data, "\n")] = '\0';
    int data_len = strlen(data);
    int base = 0;
    clock_t timers[MAX_FRAME_SIZE] = {0};
    while (base < data_len)
    {
        for (int i = base; i < base + WINDOW_SIZE && i < data_len; i++)
        {
            if (!ack_status[i] && retries[i] < MAX_RETRIES)
            {
                send_frame(data[i], i);
                timers[i] = clock();
            }
        }
        for (int i = base; i < base + WINDOW_SIZE && i < data_len; i++)
        {
            if (!ack_status[i] && retries[i] < MAX_RETRIES)
            {
                double elapsed = (double)(clock() - timers[i]) / CLOCKS_PER_SEC;
                if (elapsed >= TIMEOUT_SECONDS)
                {
                    printf("Sender: Timeout for frame %d. Retrying (%d/%d)\n", i, retries[i] + 1, MAX_RETRIES);
                    retries[i]++;
                    send_frame(data[i], i);
                    timers[i] = clock();
                }
                else
                {
                    int ack_received = receive_frame(data[i], i);
                    if (ack_received)
                    {
                        printf("Sender: ACK received for frame %d\n", i);
                        ack_status[i] = 1;
                    }
                }
            }
        }
        while (ack_status[base] && base < data_len)
        {
            base++;
        }
        for (int i = 0; i < data_len; i++)
        {
            if (retries[i] >= MAX_RETRIES && !ack_status[i])
            {
                printf("Terminating transmission.\n");
                return 0;
            }
        }
    }
    printf("Transmission complete.\n");
    return 0;
}