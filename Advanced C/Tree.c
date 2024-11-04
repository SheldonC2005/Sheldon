#include<stdio.h>
struct node
{
    int data;
    struct node *left;
    struct node *right;
};
struct node *create()
{
    int x;
    struct node *newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("\nEnter the data:(-1 for no node)");
    scanf("%d",&x);
    if(x==-1)
    {
        return 0;
    }
    else
    {
        newnode->data=x;
        printf("\nFor left child of %d",x);
        newnode->left=create();
        printf("\nFor right chlld of %d",x);
        newnode->right=create();
        return newnode;
    }
}
void main()
{
    struct node *root;
    root=0;
    root=create();
}