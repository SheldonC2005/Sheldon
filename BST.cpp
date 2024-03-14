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
};

class tree
{
    public:
    node *root;
    tree()
    {
        root=NULL;
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

    void preorder(node *r)
    {
        if(r==NULL)
        {
            return;
        }
        cout<<r->data<<endl;
        preorder(r->left);
        preorder(r->right);
    }

    void inorder(node *r)
    {
        if(r=NULL)
        {
            return;
        }
        inorder(r->left);
        cout<<r->data<<endl;
        inorder(r->right);
    }

    void postorder(node *r)
    {
        if(r==NULL)
        {
            return;
        }
        postorder(r->left);
        postorder(r->right);
        cout<<r->data<<endl;
    }
};

int main()
{
    int c,i,d;
    tree t;
    do
    {
        cout<<"*******************************"<<endl;
        cout<<"Choose option:"<<endl;
        cout<<"1.Insert node"<<endl;
        cout<<"2.Preorder print"<<endl;
        cout<<"3.Inorder print"<<endl;
        cout<<"4.Postorder print"<<endl;
        cout<<"5.Terminate program"<<endl;
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
            t.preorder(t.root);
            break;

            case 3:
            t.inorder(t.root);
            break;

            case 4:
            t.postorder(t.root);
            break;
        }
    }while(c!=5);
    return 0;
}