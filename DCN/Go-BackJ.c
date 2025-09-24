#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>
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
    if (ack_chance < 80)
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
    char data[1024];
    int base = 0, next_frame = 0;
    srand(time(NULL));
    printf("Enter data to send: ");
    fgets(data, 1024, stdin);
    data[strcspn(data, "\n")] = '\0';
    int data_len = strlen(data);
    while (base < data_len)
    {
        while (next_frame < base + WINDOW_SIZE && next_frame < data_len)
        {
            send_frame(data[next_frame], next_frame);
            next_frame++;
        }
        for (int i = base; i < next_frame; i++)
        {
            int ack_received = 0;
            int retries = 0;
            while (!ack_received && retries < 3)
            {
                clock_t start_time = clock();
                while (((double)(clock() - start_time) / CLOCKS_PER_SEC) < TIMEOUT_SECONDS)
                {
                    ack_received = receive_frame(data[i], i);
                    if (ack_received)
                    {
                        printf("Sender: ACK received for frame %d\n", i);
                        break;
                    }
                }
                if (!ack_received)
                {
                    printf("Sender: Timeout! Go-Back-N from frame %d\n", i);
                    next_frame = i;
                    break;
                }
            }
            if (!ack_received)
            {
                printf("Terminating transmission.\n");
                return 0;
            }
            base = i + 1;
        }
    }
    printf("Transmission complete.\n");
    return 0;
}