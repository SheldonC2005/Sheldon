#include <stdio.h>
unsigned int calculateChecksum(unsigned int data[], int size)
{
    unsigned int sum = 0;
    for (int i = 0; i < size; i++)
    {
        sum += data[i];
        if (sum > 0xFFFF)
        {
            sum = (sum & 0xFFFF) + 1;
        }
    }
    return ~sum & 0xFFFF;
}
int main()
{
    int n;
    printf("Enter the number of data blocks: ");
    scanf("%d", &n);
    unsigned int data[n];
    printf("Enter the data values:\n");
    for (int i = 0; i < n; i++)
    {
        printf("Data[%d]: ", i + 1);
        scanf("%x", &data[i]);
    }
    unsigned int checksum = calculateChecksum(data, n);
    printf("Calculated Checksum: %X\n", checksum);
    printf("Enter received data values including checksum:\n");
    for (int i = 0; i < n; i++)
    {
        printf("Data[%d]: ", i + 1);
        scanf("%x", &data[i]);
    }
    unsigned int receivedChecksum;
    printf("Enter received checksum: ");
    scanf("%x", &receivedChecksum);
    data[n] = receivedChecksum;
    unsigned int verifyChecksum = calculateChecksum(data, n + 1);
    if (verifyChecksum == 0)
    {
        printf("No error detected. Data is valid.\n");
    }
    else
    {
        printf("Error detected in transmission!\n");
    }
    return 0;
}