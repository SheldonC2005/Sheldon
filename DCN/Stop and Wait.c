#include <stdio.h>

void saw(int n)
{
    int seq = 0;
    for (int i = 0; i < n; i++)
    {
        printf("Sender:Sending Frame %d\n", seq);
        printf("Receiver:Received ACK for Frame %d\n", seq);
        seq = (seq + 1) % 2;
    }
    printf("Successful data communication.\n");
    printf("Success rate: 100%\n");
}

int main()
{
    int n;
    printf("Enter no of frames:");
    scanf("%d", &n);
    saw(n);
    return 0;
}
