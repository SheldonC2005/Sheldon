#include<iostream>
using namespace std;

class node
{
    public:
    int data;
    node *link;
    node()
    {
        data=0;
        link=NULL;
    }
    node(int d)
    {
        data=d;
        link=NULL;
    }
};

class stack
{
    public:
    node *top;
    stack()
    {
        top=NULL;
    }

    void push(int d)
    {
        node *t;
        t=new node;
        t->data=d;
        if(top==NULL)
        {
            cout<<"Empty stack"<<endl;
            top=t;
        }
        else
        {
            t->link=top;
            top=t;
        }
        cout<<"Data pushed successfully"<<endl;
    }

    void pop()
    {
        if(top==NULL)
        {
            cout<<"Empty stack"<<endl;
        }
        else
        {
            node *t;
            t=new node;
            t=top;
            top=top->link;
            delete(t);
        }
        cout<<"Data deleted successfully"<<endl;
    }

    void display()
    {
        node *ptr;
        ptr=new node;
        ptr=top;
        if(top==NULL)
        {
            cout<<"Empty stack"<<endl;
        }
        else
        {
            cout<<"The data is:"<<endl;
            while(ptr!=NULL)
            {
                cout<<ptr->data<<endl;
                ptr=ptr->link;
            }
        }
    }
};

int main()
{
    int c,d;
    stack s;
    do
    {
        cout<<"************************"<<endl;
        cout<<"Choose option"<<endl;
        cout<<"1.Push data"<<endl;
        cout<<"2.pop data"<<endl;
        cout<<"3.Display"<<endl;
        cout<<"4.Terminate program"<<endl;
        cin>>c;
        switch(c)
        {
            case 1:
            cout<<"Enter data:"<<endl;
            cin>>d;
            s.push(d);
            break;

            case 2:
            s.pop();
            break;

            case 3:
            s.display();
            break;
        }
    } while (c!=4);
    return 0;
}