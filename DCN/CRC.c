#include <stdio.h>
#include <string.h>

void bd(char dd[], char ds[], char r[])
{
    int n = strlen(ds);
    int m = strlen(dd);
    strcpy(r, dd);
    for (int i = 0; i <= m - n; i++)
    {
        if (r[i] == '1')
        {
            for (int j = 0; j < n; j++)
            {
                r[i + j] = (r[i + j] == ds[j]) ? '0' : '1';
            }
        }
    }
}

void appcrc(char d[], char ds[], char cw[])
{
    int k = strlen(d);
    int n = strlen(ds);
    char dd[100];
    strcpy(dd, d);
    for (int i = 0; i < n - 1; i++)
    {
        strcat(dd, "0");
    }
    char r[100];
    bd(dd, ds, r);
    strcpy(cw, d);
    strcat(cw, r + k);
}

void ver(char rec[], char ds[])
{
    char r[100];
    bd(rec, ds, r);
    printf("\nReceiver Side:\n");
    printf("Remainder: %s\n", r + strlen(rec) - strlen(ds) + 1);
    int v = 1;
    for (int i = strlen(rec) - strlen(ds) + 1; i < strlen(rec); i++)
    {
        if (r[i] != '0')
        {
            v = 0;
            break;
        }
    }
    if (v)
        printf("Status: Data Accepted\n");
    else
        printf("Status: Data Discarded\n");
}

int main()
{
    char d[100], ds[100], cw[100], rec[100];
    char choice;
    printf("Enter data:");
    scanf("%s", d);
    printf("Enter divisor:");
    scanf("%s", ds);
    appcrc(d, ds, cw);
    printf("\nSender Side:\n");
    printf("Code word: %s\n", cw);
    strcpy(rec, cw);
    printf("\nReceiver Side:\n");
    printf("Received code word: %s\n", rec);
    printf("Bit Alteration? (y/n):");
    scanf("%c", &choice);
    if (choice == 'y' || choice == 'Y')
    {
        printf("Enter new data:");
        scanf("%s", rec);
    }
    ver(rec, ds);
    return 0;
}
