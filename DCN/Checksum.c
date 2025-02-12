#include <stdio.h>
#include <string.h>
#include <math.h>
int btod(char *b, int n)
{
    int d = 0;
    for (int i = 0; i < n; i++)
    {
        d = (d << 1) | (b[i] - '0');
    }
    return d;
}

void dtob(int num, int n, char *b)
{
    for (int i = n - 1; i >= 0; i--)
    {
        b[i] = (num & 1) + '0';
        num >>= 1;
    }
    b[n] = '\0';
}

int calcCS(int d[], int k, int n)
{
    int sum = 0, m = (1 << n) - 1;
    for (int i = 0; i < k; i++)
    {
        sum += d[i];
        sum = (sum & m) + (sum >> n);
    }
    return ~sum & m;
}

int main()
{
    int k, n;
    printf("Enter no of frames:");
    scanf("%d", &k);
    printf("Enter no of bits per frame:");
    scanf("%d", &n);
    int d[k];
    char ip[n + 1];
    printf("Enter data seperated by space for each section:\n");
    for (int i = 0; i < k; i++)
    {
        scanf("%s", ip);
        d[i] = btod(ip, n);
    }
    int cs = calcCS(d, k, n);
    char csb[n + 1];
    dtob(cs, n, csb);
    printf("\nSender side:\n");
    printf("Data Sent:");
    for (int i = 0; i < k; i++)
    {
        char b[n + 1];
        dtob(d[i], n, b);
        printf("%s ", b);
    }
    printf("%s\n", csb);
    int received[k + 1];
    memcpy(received, d, k * sizeof(int));
    received[k] = cs;
    printf("\nReceiver Side:\n");
    printf("Received data:");
    for (int i = 0; i < k; i++)
    {
        char b[n + 1];
        dtob(received[i], n, b);
        printf("%s ", b);
    }
    printf("%s\n", csb);
    char choice;
    printf("Any data to be flipped? (y/n):");
    scanf(" %c", &choice);
    if (choice == 'y' || choice == 'Y')
    {
        int i;
        char nb[n + 1];
        printf("Enter the frame index and new data bits seperated by a space:");
        scanf("%d %s", &i, nb);
        if (i >= 0 && i <= k)
        {
            received[i] = btod(nb, n);
        }
    }
    int rcs = calcCS(received, k + 1, n);
    char rcsb[n + 1];
    dtob(rcs, n, rcsb);
    printf("\nReceiver Verification:\n");
    printf("Recalculated Checksum: %s\n", rcsb);
    if (rcs == 0)
        printf("Status: Approved\n");
    else
        printf("Status: Discarded\n");

    return 0;
}