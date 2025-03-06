#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void receiver(int ack[], int f, int suc[], int att[], int las[])
{
    for (int i = las[0]; i < f; i++)
    {
        if (ack[i] == 0)
        {
            att[0]++;
            if (rand() % 10 < 8)
            {
                ack[i] = 1;
                suc[0]++;
                printf("Receiver:Frame %d is acknowledged\n", i);
                las[0] = i + 1;
            }
            else
            {
                printf("Receiver:Frame %d acknowledgement is lost\n", i);
                break;
            }
        }
    }
}

void sender(int f, int w)
{
    int ack[100] = {0};
    srand(time(0));
    int bas = 0, suc[1] = {0}, att[1] = {0}, las[1] = {0};
    while (bas < f)
    {
        for (int i = 0; i < w && bas + i < f; i++)
        {
            if (ack[bas + i] == 0)
                printf("Sender: Frame %d\n", bas + i);
        }
        receiver(ack, f, suc, att, las);
        if (las[0] > bas)
            bas = las[0];
        else
        {
            printf("Sender: Timeout! Resend from %d\n", bas);
            att[0]++;
        }
    }
    printf("Success rate: %.2f%%\n", ((float)suc[0] / att[0]) * 100);
}
int main()
{
    int f, w;
    printf("Enter no of frames: ");
    scanf("%d", &f);
    printf("Enter window size: ");
    scanf("%d", &w);
    sender(f, w);
    printf("All frames sent.\n");
    return 0;
}
