#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>
void sendframe(char bit, int frameno)
{
    printf("Sender: Sending frame %d -> %c\n", frameno, bit);
}
int recieveframe(char bit, int frameno)
{
    printf("Receiver: Received frame %d -> %c\n", frameno, bit);
    int c = rand() % 100;
    if (c < 80)
    {
        printf("Reciever: Sending ACK for frame %d\n", frameno);
        return 1;
    }
    else
    {
        printf("Receiver: ACK for frame %d lost!\n", frameno);
        return 0;
    }
}
int main()
{
    char data[1024];
    int base = 0, next = 0;
    srand(time(NULL));
    printf("Enter data to send: ");
    fgets(data, 1024, stdin);
    data[strcspn(data, "\n")] = '\0';
    int len = strlen(data);
    while (base < len)
    {
        while (next < base + 4 && next < len)
        {
            sendframe(data[next], next);
            next++;
        }
        for (int i = base; i < next; i++)
        {
            int ackr = 0, retry = 0;
            while (!ackr && retry < 3)
            {
                clock_t start = clock();
                while ((((double)(clock() - start)) / CLOCKS_PER_SEC) < 2)
                {
                    ackr = recieveframe(data[i], i);
                    if (ackr)
                    {
                        printf("Sender: ACK received for frame %d\n", i);
                        break;
                    }
                }
                if (!ackr)
                {
                    printf("Sender timeout\n");
                    next = i;
                    break;
                }
            }
            if (!ackr)
            {
                printf("Terminating\n");
                return 0;
            }
            base = i + 1;
        }
    }
    printf("Transmission complete\n");
    return 0;
}