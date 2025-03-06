#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void reciever(int ack[], int f, int suc[], int att[])
{
    for (int i = 0; i < f; i++)
    {
        if (ack[i] == 0)
        {
            att[0]++;
            if (rand() % 10 < 8)
            {
                ack[i] == 1;
                suc[0]++;
                printf("Receiver:Acknowledge frame %d\n", i);
            }
            else
            {
                printf("Reciever:Acknowledgement of %d is lost\n", i);
            }
        }
    }
}
void sender(int f, int w)
{
    int ack[100] = {0};
    srand(time(0));
    int b = 0;
    int suc[1] = {0};
    int att[1] = {0};
    while (b < f)
    {
        for (int i = 0; i < w && b + i < f; i++)
        {
            if (ack[b + i] == 0)
            {
                printf("Sender: Frame %d\n", b + i);
            }
        }
        reciever(ack, f, suc, att);
        for (int i = b; i < b + w && i < f; i++)
        {
            if (ack[i] == 0)
            {
                printf("Sender: Timeout.Resend %d\n", i);
                att[0]++;
            }
        }
        while (b < f && ack[b] == 1)
        {
            b++;
        }
    }
    float rate = ((float)suc[0] / att[0]) * 100;
    printf("Success rate: %.2f%%\n", rate);
}
int main()
{
    int f, w;
    printf("Enter no of frames:");
    scanf("%d", &f);
    printf("Enter window size:");
    scanf("%d", &w);
    sender(f, w);
    printf("All frames sent");
    return 0;
}