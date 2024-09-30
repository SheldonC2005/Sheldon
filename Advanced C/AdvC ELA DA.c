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

#define MAX_n 100

int main()
{
    int N;
    printf("Enter the n of the matrix (N x N): ");
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
    printf("Absolute value of the differenj = |%d - %d| = %d\n", smallest, largest, abs_diff);
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
   int n,a=1,j,i,j;
   printf("Enter the number of n:");
   scanf("%d", &n);
   for (i=0;i<n;i++)
   {
      for(j=1;j<=n-i;j++)
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
    int n = nof(arr) / nof(arr[0]);
    int stack[n];
    int top = -1;
    stack[++top] = 0;
    stack[++top] = n - 1;
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
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}*/

/*#include <stdio.h>
int main()
{
   int i, j, n, k = 0;
   printf("Enter n: ");
   scanf("%d", &n);
   for (i = 1; i <= n;i++, k = 0)
   {
        for (j = 1; j <= n - i;j++)
        {
            printf("  ");
        }
        while (k != 2 * i - 1)
        {
            printf("%d ",i);
            k++;
        }
        printf("\n");
   }
   return 0;
}*/

/*#include <stdio.h>
int main()
{
   int i, j, n, k = 0;
   printf("Enter n: ");
   scanf("%d", &n);
   for (i = 1; i <= n;i++, k = 0)
   {
        for (j = 1; j <= n - i;j++)
        {
            printf("  ");
        }
        for(k=1;k<=i;k++)
        {
            printf("%d ",i);
        }
        printf("\n");
   }
   return 0;
}*/

/*#include <stdio.h>
int main()
{
   int i, j, n, k = 0;
   printf("Enter n: ");
   scanf("%d", &n);
   for (i = 1; i <= n;i++, k = 0)
   {
        for (j = 1; j <= n - i;j++)
        {
            printf("  ");
        }
        for(k=1;k<=2*i-1;k++)
        {
            if(k==1||k==2*i-1||i==n)
            {
                printf("* ");
            }
            else
            {
                printf("  ");
            }
        }
        printf("\n");
   }
   return 0;
}*/

//                                        ELA DA-3
//1
/*#include <stdio.h>
#define MAX 10
int isSymmetric(int (*matrix)[MAX], int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            if (matrix[i][j] != matrix[j][i])
            {
                return 0;
            }
        }
    }
    return 1;
}

int main()
{
    int matrix[MAX][MAX];
    int size;
    printf("Enter the size of the matrix (n x n): ");
    scanf("%d", &size);
    printf("Enter the elements of the matrix:\n");
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            printf("Element [%d][%d]: ", i, j);
            scanf("%d", &matrix[i][j]);
        }
    }
    if (isSymmetric(matrix, size))
    {
        printf("The matrix is symmetric.\n");
    }
    else
    {
        printf("The matrix is not symmetric.\n");
    }
    return 0;
}*/
//2
/*#include <stdio.h>
#include <string.h>
void cleanString(char *input, char *output)
{
    while (*input)
    {
        // Check if the character is alphanumeric or a space
        if ((*input >= 'A' && *input <= 'Z') || (*input >= 'a' && *input <= 'z') || 
            (*input >= '0' && *input <= '9') || *input == ' ')
        {
            *output++ = *input;  // Copy valid characters
        }
        input++;
    }
    *output = '\0';
}
void sortWords(char words[][100], int count)
{
    for (int i = 0; i < count - 1; i++)
    {
        for (int j = i + 1; j < count; j++)
        {
            if (strlen(words[i]) > strlen(words[j]))
            {
                char temp[100];
                strcpy(temp, words[i]);
                strcpy(words[i], words[j]);
                strcpy(words[j], temp);
            }
        }
    }
}

int main()
{
    char input[100];
    char cleaned[100];
    char words[50][100];
    int wordCount = 0;
    printf("Enter a statement: ");
    fgets(input, 100, stdin);
    cleanString(input, cleaned);
    char *token = strtok(cleaned, " ");
    while (token)
    {
        strcpy(words[wordCount++], token);
        token = strtok(NULL, " ");
    }
    sortWords(words, wordCount);
    for (int i = 0; i < wordCount; i++)
    {
        printf("\t%s\n", words[i]);
    }
    return 0;
}*/
//3
/*#include <stdio.h>
union PhoneNumber
{
    long long mobile;
    char landline[100];
};
struct GuardianDetails
{
    char name[100];
    char address[100];
    char relation[100];
    union PhoneNumber phone;
    int isMobile;
};
void removeNewline(char *str) {
    int i = 0;
    while (str[i] != '\0') {
        if (str[i] == '\n') {
            str[i] = '\0';
            break;
        }
        i++;
    }
}

int main()
{
    struct GuardianDetails guardian;
    printf("Enter Guardian Name: ");
    fgets(guardian.name, 100, stdin);
    removeNewline(guardian.name);
    printf("Enter Address: ");
    fgets(guardian.address, 100, stdin);
    removeNewline(guardian.address);
    printf("Enter Relation: ");
    fgets(guardian.relation, 100, stdin);
    removeNewline(guardian.relation);
    printf("Enter Mobile Number (10 digits) or Landline Number: ");
    char phoneInput[100];
    fgets(phoneInput, 100, stdin);
    removeNewline(phoneInput);
    if (phoneInput[0] >= '0' && phoneInput[0] <= '9' && phoneInput[1] >= '0' && 
        phoneInput[2] >= '0' && phoneInput[3] >= '0' && phoneInput[4] >= '0' &&
        phoneInput[5] >= '0' && phoneInput[6] >= '0' && phoneInput[7] >= '0' &&
        phoneInput[8] >= '0' && phoneInput[9] >= '0')
    {
        guardian.phone.mobile = 0;
        for (int i = 0; i < 10; i++)
        {
            guardian.phone.mobile = guardian.phone.mobile * 10 + (phoneInput[i] - '0');
        }
        guardian.isMobile = 1;
    }
    else
    {
        int i = 0;
        while (phoneInput[i] != '\0' && i < 100 - 1)
        {
            guardian.phone.landline[i] = phoneInput[i];
            i++;
        }
        guardian.phone.landline[i] = '\0';
        guardian.isMobile = 0;
    }
    printf("\nGuardian Details:\n");
    printf("Name: %s\n", guardian.name);
    printf("Address: %s\n", guardian.address);
    printf("Relation: %s\n", guardian.relation);
    if (guardian.isMobile)
    {
        printf("Mobile Number: %lld\n", guardian.phone.mobile);
    } else
    {
        printf("Landline Number: %s\n", guardian.phone.landline);
    }
    return 0;
}*/
//4
/*#include <stdio.h>
struct Student
{
    char name[50];
    int reg_number;
    float cgpa;
};
int binarySearch(struct Student students[], int size, int key)
{
    int left = 0, right = size - 1;
    while (left <= right)
    {
        int mid = left + (right - left) / 2;
        if (students[mid].reg_number == key)
        {
            return mid; // Found
        }
        if (students[mid].reg_number < key)
        {
            left = mid + 1;
        }
        else
        {
            right = mid - 1;
        }
    }
    return -1;
}
void sortStudents(struct Student students[], int size)
{
    for (int i = 0; i < size - 1; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (students[i].reg_number > students[j].reg_number)
            {
                struct Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
    }
}
int main()
{
    struct Student students[100];
    int n;
    printf("Enter the number of students: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("Enter name, registration number, and CGPA of student %d:\n", i + 1);
        scanf("%s %d %f", students[i].name, &students[i].reg_number, &students[i].cgpa);
    }
    sortStudents(students, n);
    int searchRegNumber;
    printf("Enter registration number to search: ");
    scanf("%d", &searchRegNumber);
    int index = binarySearch(students, n, searchRegNumber);
    if (index != -1)
    {
        printf("\nStudent Details:\n");
        printf("Name: %s\n", students[index].name);
        printf("Registration Number: %d\n", students[index].reg_number);
        printf("CGPA: %.2f\n", students[index].cgpa);
    }
    else
    {
        printf("Student not found.\n");
    }
    return 0;
}*/

#include<stdio.h>
 void prime(int n)
 {
    int f=0;
    for(int i=i;i<=n;i++)
    {
        if(n%i==0)
        {
            f++;
        }
    }
    if(f==2)
    {
        printf("\n%d is a Prime Number\n",n);
    }
    else
    {
        printf("\n%d is not a Prime Number\n",n);
    }
 }
 void factors(int n)
 {
    printf("Factors: ");
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            printf("%d ",i);
        }
    }
 }
 void primefactors(int n)
 {
    printf("Prime factors: ");
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            if(i==1 || i==n)
            {
                continue;
            }
            else
            {
                int ctr=0;
                for(int j=1;j<=1;j++)
                {
                    if(i%j==0)
                    {
                        ctr++;
                    }
                }
                if(ctr==2)
                {
                    printf("%d ",i);
                }
            }
        }
    }
 }

 int main()
 {
    int c,n;
    void (*ptr[])(int)={prime,factors,primefactors};
    do
    {
        printf("\n*********************************************\n");
        printf("Enter n: ");
        scanf("%d",&n);
        printf("Enter choice:\n");
        printf("1.Check if prime number\n");
        printf("2.Find the factors\n");
        printf("3.Find the prime factors\n");
        scanf("\n%d",&c);
        (*ptr[c-1])(n);
    } while (n!=0);
    return 0;
 }