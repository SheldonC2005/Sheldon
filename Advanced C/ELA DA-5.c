/*#include <stdio.h>

int main() {
    int number;
    printf("Enter a number: ");
    if (scanf("%d", &number) != 1) {
        fprintf(stderr, "Error: Invalid input. Please enter a valid integer.\n");
        return 1;
    }
    printf("You entered: %d\n", number);
    return 0;
}*/
/*#include<stdio.h>
#define CGPA 1
int main()
{
    #if CGPA>9
        printf("Allow for test");
    #elif CGPA<4 && CGPA>2
        printf("Meet proctor");
    #else
        printf("Verify attendance percentage");
    #endif
}*/
/*#include<stdio.h>
#define CUBE(b) b*b*b
int main()
{
    printf("%d\n", CUBE(1+2*2));
    printf("%d\n", CUBE(2+1*2));
    printf("%d\n", CUBE(2*2));
    return 0;
}*/
/*#include<stdio.h>
#define EVOROD(a) if(a%2==0)\
	printf("a is Even");\
	else\
	printf("a is Odd")
int main()
{
int x=23,y=30;
EVOROD(x);
//#undef EVOROD
//EVOROD(y);
return 0;
}*/
/*#include <stdio.h>
#include <stdlib.h>

int main() {
    int *array;
    int i;

    // Allocate memory for an array of 5 integers using calloc
    array = (int *)calloc(5, sizeof(int));
    if (array == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }

    // Initialize the array with values
    for (i = 0; i < 5; i++) {
        array[i] = i + 1; // Fill with values 1 to 5
    }

    // Display the addresses and contents before reallocation
    printf("Before reallocation:\n");
    for (i = 0; i < 5; i++) {
        printf("Address of array[%d]: %p, Content: %d\n", i,&array[i], array[i]);
    }

    // Reallocate the array to size 10
    array = (int *)realloc(array, 10 * sizeof(int));
    if (array == NULL) {
        printf("Memory reallocation failed\n");
        return 1;
    }

    // Initialize the new elements in the reallocated array
    for (i = 5; i < 10; i++) {
        array[i] = (i + 1) * 10; // Fill with values 60, 70, ..., 100
    }

    // Display the addresses and contents after reallocation
    printf("\nAfter reallocation:\n");
    for (i = 0; i < 10; i++) {
        printf("Address of array[%d]: %p, Content: %d\n", i, (void *)&array[i], array[i]);
    }

    // Free the allocated memory
    free(array);

    return 0;
}*/

/*#include <stdio.h>
#include <string.h>

// Define the structure Student
struct Student {
    char name[50];      // String for the student's name
    int roll_no;        // Integer for the roll number
    int marks[5];       // Array to hold marks for 5 subjects
};

// Function to input data for 5 students
void inputStudent(struct Student* students, int num_students) {
    for (int i = 0; i < num_students; i++) {
        printf("Enter details for student %d:\n", i + 1);

        // Input name
        printf("Name: ");
        getchar(); // Clear the input buffer
        fgets(students[i].name, sizeof(students[i].name), stdin);
        students[i].name[strcspn(students[i].name, "\n")] = '\0'; // Remove newline

        // Input roll number
        printf("Roll Number: ");
        scanf("%d", &students[i].roll_no);

        // Input marks
        printf("Enter marks for 5 subjects:\n");
        for (int j = 0; j < 5; j++) {
            printf("Subject %d: ", j + 1);
            scanf("%d", &students[i].marks[j]);
        }
    }
}

// Main function
int main() {
    int num_students = 5;
    struct Student students[num_students]; // Array of 5 students

    // Call the input function
    inputStudent(students, num_students);

    // Print the entered details
    printf("\nEntered details are:\n");
    for (int i = 0; i < num_students; i++) {
        printf("\nStudent %d:\n", i + 1);
        printf("Name: %s\n", students[i].name);
        printf("Roll Number: %d\n", students[i].roll_no);
        printf("Marks: ");
        for (int j = 0; j < 5; j++) {
            printf("%d ", students[i].marks[j]);
        }
        printf("\n");
    }

    return 0;
}*/

/*const int MAX = 3; 
int main () 
{ int var[] = {10, 100, 200}; 
int i, *ptr;  
ptr = var; 
for ( i = 0; i < MAX; i++) 
{ printf("Address of var[%d] = %x\n", i, (ptr+i) ); 
printf("Value of var[%d] = %d\n", i, *(ptr+i) ); 
} 
return 0; }*/

/*#include<stdio.h>
int main()
{
    int *p;
    int a[3][2];
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<2;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    p=a[0];
    printf("%d\t%d\t%d\t%d\t%d\t%d",a,&a,*a,a[0],&a[0],&a[0][0]);
    printf("\n%d\t%d\t%d\t%d\t%d",p,&p,*p,p[0],&p[0]);
    printf("\n%d\t%d\t%d\t%d\t%d\t%d\t%d",p+1,a+1,&a+1,*a+1,a[0]+1,&a[0]+1,&a[0][0]+1);
    printf("\n%d\t%d\t%d",p[0],p[1],p[0]+10);
    printf("\n%d\t%d\t%d",*p,**a,*a[0]);
    return 0;
}*/
#include<stdio.h>
int main()
{
    int a[3]={1,2,3};
    int *p[3];
    for(int i=0;i<3;i++)
    {
        p[i]=&a[i];
    }
    for(int i=0;i<3;i++)
    {
        printf("%d\t",*p[i]);
    }
    return 0;
}