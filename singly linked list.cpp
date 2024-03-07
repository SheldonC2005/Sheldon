#include<iostream>
using namespace std;

class node
{
    public:
    int data;
    node *link;
}*p;

void add(int d)
{
    node *q,*t;
    if(p==nullptr)
    {
        p=new node;
        p->link=NULL;
        p->data=d;
    }
    else
    {
        q=p;
        while(q->link!=NULL)
        {
            q=q->link;
        }
        t=new node;
        t->link=NULL;
        t->data=d;
        q->link=t;
    }
    cout<<"Data added successfully!!"<<endl;
}

void addafter(int s,int d)
{
    node *q,*t;
    q=p;
    for(int i=0;i<s;i++)
    {
        q=q->link;
    }
    t=new node;
    t->data=d;
    q->link=t;
    t->link=q->link;
    cout<<"Data added successfully!!!"<<endl;
}

void display()
{
    node *q;
    for(q=p;q!=NULL;q=q->link)
    {
        cout<<" "<<endl;
        cout<<q->data<<endl;
        cout<<" "<<endl;
    }
}

int main()
{
    int i,c,d,p;
    do
    {
        cout<<"***********************"<<endl;
        cout<<"Choose option"<<endl;
        cout<<"1.Add data"<<endl;
        cout<<"2.Add data at position"<<endl;
        cout<<"3.Display data"<<endl;
        cout<<"4.Terminate program"<<endl;
        cin>>c;
        switch(c)
        {
            case 1:
            cout<<"Enter data:"<<endl;
            cin>>d;
            add(d);
            break;

            case 2:
            cout<<"Enter position to add data:"<<endl;
            cin>>p;
            cout<<"Enter data:"<<endl;
            cin>>d;
            addafter(p,d);
            break;

            case 3:
            display();
            break;
        }
    }
    while(c!=4);
    return 0;
}