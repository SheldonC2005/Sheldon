/*
  Sheldon.C
  23MID0031
*/
#include<stdio.h>

int main()
{
    int i,n,a,j;
    float avg,total=0;
    printf("Enter n: ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("Enter number: ");
        scanf("%d",&a);
        if(a<0)
        {
            j=i-1;
            continue;
        }
        total+=a;
    }
    avg=total/j;
    printf("Total: %f\n",total);
    printf("Average: %f",avg);
    return 0;
}
