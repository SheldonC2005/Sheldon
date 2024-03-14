#include<iostream>
#define SPACE 10
using namespace std;

class node
{
    public:
    int data;
    node *left;
    node *right;
    node()
    {
        data=0;
        left=right=NULL;
    }
    node(int d)
    {
        data=d;
        left=right=NULL;
    }
};

class tree
{
    public:
    node *root;
    tree()
    {
        root=NULL;
    }
    bool isempty()
    {
        if(root==NULL)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void insert(node *n)
    {
        if(root==NULL)
        {
            cout<<"Empty tree"<<endl;
            root=n;
            cout<<"Root Node is defined"<<endl;
        }
        else
        {
            node *t;
            t=root;
            while(t!=NULL)
            {
                if(n->data==t->data)
                {
                    cout<<"Data already exists"<<endl;
                    return;
                }
                else if(n->data<t->data && t->left==NULL)
                {
                    t->left=n;
                    cout<<"Node inserted to the left"<<endl;
                    break;
                }
                else if(n->data<t->data)
                {
                    t=t->left;
                }
                else if(n->data>t->data && t->right==NULL)
                {
                    t->right=n;
                    cout<<"Node inserted to the right"<<endl;
                    break;
                }
                else if(n->data>t->data)
                {
                    t=t->right;
                }
            }
        }
    }
};

int main()
{
    int c,i,d;
    tree t;
    do
    {
        cout<<"*******************************"<<endl;
        cout<<"Choose option:(0 to exit)"<<endl;
        cout<<"1.Insert node"<<endl;
        cout<<"2.Search node"<<endl;
        cin>>c;
        node *n;
        n=new node();
        switch(c)
        {
            case 1:
            cout<<"Enter data:"<<endl;
            cin>>d;
            n->data=d;
            t.insert(n);
            break;

            case 2:
            //traversal
            break;
        }
    }while(c!=0);
    return 0;
}