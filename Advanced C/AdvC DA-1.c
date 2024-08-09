/*
  Sheldon.C
  23MID0031
*/
#include<stdio.h>

/*int main()                                    // Code to get input until -ve number
{
    int i,n,a;
    float avg,total=0;
    printf("Enter n: ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("Enter number: ");
        scanf("%d",&a);
        if(a>=0)
        {
            total+=a;
        }
        else
        {
            goto jump;
        }
    }
    jump:
    avg=total/i;
    printf("Total: %f\n",total);
    printf("Average: %f",avg);
    return 0;
}*/

/*int main()                                                   //Code to print Total,Average and Grade of 5 input marks
{
    int m[5],total=0,avg;
    for(int i=0;i<5;i++)
    {
        printf("Enter Subject %d mark(out of 100):",i+1);
        scanf("%d",&m[i]);
        total+=m[i];
    }
    avg=total/5;
    printf("Total: %d\n",total);
    printf("Average: %d\n",avg);
    if(avg>=95)
    {
        printf("Grade: S");
    }
    else if(90<=avg<95)
    {
        printf("Grade: A");
    }
    else if(70<=avg<90)
    {
        printf("Grade: B");
    }
    else if(50<=avg<70)
    {
        printf("Grade: C");
    }
    else if(33<=avg<50)
    {
        printf("Grade: D");
    }
    else if(avg<33)
    {
        printf("Grade: Fail");
    }
    return 0;
}*/


/*int main()                                  //Code to print Pyramid Stars
{
   int i,j,n,k=0;
   printf("Enter the number of n: ");
   scanf("%d", &n);
   for(i=1;i<=n;i++,k=0)
   {
      for(j=1;j<=n-i;j++)
      {
        printf("  ");
      }
      while(k!=2*i-1)
      {
        printf("* ");
        k++;
      }
      printf("\n");
   }
   return 0;
}*/
