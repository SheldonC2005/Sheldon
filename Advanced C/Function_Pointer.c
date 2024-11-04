#include<stdio.h>
void add(int a,int b)
{
    printf("Sum: %d",a+b);
}
void sub(int a,int b)
{
    printf("Difference: %d",a-b);
}
void mul(int a,int b)
{
    printf("Product: %d",a*b);
}
int main()
{
    void (*ptr[])(int,int)={add,sub,mul};
    int a,b,c;
    printf("Enter two numbers: ");
    scanf("%d%d",&a,&b);
    printf("Enter choice:");
    scanf("%d",&c);
    (*ptr[c-1])(a,b);
    return 0;
}