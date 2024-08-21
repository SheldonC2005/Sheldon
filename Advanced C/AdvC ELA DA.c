/*
  Sheldon.C
  23MID0031

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
}*/

//PROGRAM 1
/*#include<stdio.h>
int main()
{
    char a[20];
    int c1=0,c2=0,c3=0,n;
    printf("Enter no of inputs:\n");
    scanf("%d",&n);
    printf("Enter inputs:\n");
    for(int i=0;i<n;i++)
    {
        scanf("%c",&a[i]);
        if(a[i]=='A')
        {
            c1++;
        }
        if(a[i]=='B')
        {
            c2++;
        }
        if(a[i]=='C')
        {
            c3++;
        }
    }
    for(int i=0;i<c3;i++)
    {
        printf("C");
    }
    for(int i=0;i<c2;i++)
    {
        printf("B");
    }
    for(int i=0;i<c1;i++)
    {
        printf("A");
    }
    return 0;
}*/

//PROGRAM 2
/*#include<stdio.h>
int main()
{
    int n;
    printf("Enter array n: \n");
    scanf("%d",&n);
    int arr[n];
    int S;
    printf("Enter the array elements:\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the sum value S:\n");
    scanf("%d", &S);
    int start = 0, end = 0;
    int current_sum = arr[0];
    while (end < n)
    {
        if (current_sum == S)
        {
            printf("Sub-array with sum %d is: [", S);
            for (int i = start; i <= end; i++)
            {
                printf("%d", arr[i]);
                if (i < end)
                {
                    printf(" ");
                }
            }
            printf("]\n");
            break;
        }
        else if (current_sum < S)
        {
            end++;
            if (end < n)
            {
                current_sum += arr[end];
            }
        }
        else
        {
            current_sum -= arr[start];
            start++;
            if (start > end && start < n)
            {
                end = start;
                current_sum = arr[start];
            }
        }
    }
    return 0;
}*/

//PROGRAM 3
/*#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

int main()
{
    int N;
    printf("Enter the size of the matrix (N x N): ");
    scanf("%d", &N);
    int matrix[N][N];
    printf("Enter the elements of the matrix:\n");
    int smallest = 2147483647;
    int largest = -2147483648;
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            scanf("%d", &matrix[i][j]);
            if (matrix[i][j] < smallest)
            {
                smallest = matrix[i][j];
            }
            if (matrix[i][j] > largest)
            {
                largest = matrix[i][j];
            }
        }
    }
    int abs_diff = abs(largest - smallest);
    for (int i = 0; i < N; i++)
    {
        matrix[i][i] += abs_diff;
    }
    printf("Smallest number is %d\n", smallest);
    printf("Largest number is %d\n", largest);
    printf("Absolute value of the difference = |%d - %d| = %d\n", smallest, largest, abs_diff);
    printf("Output matrix:\n");
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
    return 0;
}*/

//PROGRAM 4
/*#include <stdio.h>
int main()
{
   int rows,a=1,space,i,j;
   printf("Enter the number of rows:");
   scanf("%d", &rows);
   for (i=0;i<rows;i++)
   {
      for(space=1;space<=rows-i;space++)
      {
        printf("  ");
      }
      for(j=0;j<=i;j++)
      {
        if(j==0||i==0)
            a=1;
        else
            a=a*(i-j+1)/j;
        printf("%4d",a);
      }
      printf("\n");
   }
   return 0;
}*/

//PROGRAM 5
/*#include <stdio.h>
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}
int main()
{
    int n;
    printf("Enter number of elements: \n");
    scanf("%d",&n);
    int arr[n];
    printf("Enter elements of array:\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    int size = sizeof(arr) / sizeof(arr[0]);
    int stack[size];
    int top = -1;
    stack[++top] = 0;
    stack[++top] = size - 1;
    while (top >= 0)
    {
        int high = stack[top--];
        int low = stack[top--];
        int pivot = arr[low + (high - low) / 2];
        int i = low, j = high;
        while (i <= j)
        {
            while (arr[i] < pivot)
            i++;
            while (arr[j] > pivot)
            j--;
            if (i <= j)
            {
                swap(&arr[i], &arr[j]);
                i++;
                j--;
            }
        }
        if (low < j)
        {
            stack[++top] = low;
            stack[++top] = j;
        }
        if (i < high)
        {
            stack[++top] = i;
            stack[++top] = high;
        }
    }
    printf("Sorted array:\n");
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}*/