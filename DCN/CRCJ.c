#include <stdio.h>
#include <string.h>
void xorOperation(char dividend[], char divisor[], int len)
{
    for (int i = 0; i < len; i++)
    {
        dividend[i] = (dividend[i] == divisor[i]) ? '0' : '1';
    }
}
void computeCRC(char data[], char divisor[], char crc[])
{
    int dataLen = strlen(data);
    int divisorLen = strlen(divisor);
    char temp[dataLen + 1];
    strcpy(temp, data);
    for (int i = 0; i <= dataLen - divisorLen; i++)
    {
        if (temp[i] == '1')
        {
            xorOperation(temp + i, divisor, divisorLen);
        }
    }
    strcpy(crc, temp + dataLen - divisorLen + 1);
}
int main()
{
    char data[100], divisor[100], crc[100];
    printf("Enter data bits: ");
    scanf("%s", data);
    printf("Enter divisor: ");
    scanf("%s", divisor);
    int dataLen = strlen(data);
    int divisorLen = strlen(divisor);
    char appendedData[200];
    strcpy(appendedData, data);
    for (int i = 0; i < divisorLen - 1; i++)
    {
        strcat(appendedData, "0");
    }
    computeCRC(appendedData, divisor, crc);
    printf("Generated CRC: %s\n", crc);
    char transmittedData[200];
    strcpy(transmittedData, data);
    strcat(transmittedData, crc);
    printf("Transmitted data with CRC: %s\n", transmittedData);
    printf("Enter received data: ");
    scanf("%s", appendedData);
    computeCRC(appendedData, divisor, crc);
    int error = 0;
    for (int i = 0; i < strlen(crc); i++)
    {
        if (crc[i] != '0')
        {
            error = 1;
            break;
        }
    }
    if (error)
    {
        printf("Error detected in transmission!\n");
    }
    else
    {
        printf("No error detected.\n");
    }
    return 0;
}