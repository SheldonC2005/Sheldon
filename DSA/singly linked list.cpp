#include<iostream>
using namespace std;

class node
{
    public:
    int key;
    int data;
    node *link;

    node()
    {
        key=0;
        data=0;
        link=NULL;
    }

    node(int k,int d)
    {
        key=k;
        data=d;
        link=NULL;
    }
};

class sll//this needs to be called in driver main function as an object of sll
{
    public:
    node *head;

    sll()
    {
        head=NULL;
    }
    sll(node *n)
    {
        head=n;
    }

    node *nodeexists(int k)//to check if node exits using the key value
    {
        node *t;
        t=NULL;
        node *ptr;
        ptr=head;
        while(ptr!=NULL)//pointer traverses the sll
        {
            if(ptr->key==k)
            {
                t=ptr;//if key matches....value is stored in temp
            }
            ptr=ptr->link;
        }
        return t;//if no key match...temp stays null...else stores value
    }

    void append(node *n)//return type of node...so the node is appended as a whole using pointer in line 72 to 79
    {
        if(nodeexists(n->key)!=NULL)//to check is node exists of a certain key using previous function
        {
            cout<<"Node already exists with key:"<<n->key<<endl;
        }
        else
        {
            if(head==NULL)//when no node is in sll
            {
                head=n;
                cout<<"Node appended(First node is created)";
            }
            else
            {
                node *ptr;
                ptr=head;
                while(ptr->link!=NULL)//to traverse along all until end ie.NULL
                {
                    ptr=ptr->link;
                }
                ptr->link=n;//the link of final node which was previously NULL is now changed to link or point n
                cout<<"Node appended"<<endl;
            }
        }
    }

    void prepend(node *n)
    {
        if(nodeexists(n->key)!=NULL)//to check is node exists of a certain key using previous function
        {
            cout<<"Node already exists with key:"<<n->key<<endl;
        }
        else
        {
            n->link=head;//link to head is stored in given node to be prepended
            head=n;//head pointer shifts to point to n
            cout<<"Node prepended"<<endl;
        }
    }

    void insert(int k,node *n)
    {
        node *ptr;
        ptr=nodeexists(k);// to retrieve the address of the node which exits after which another node is to be inserted
        if(ptr==NULL)
        {
            cout<<"No node exits with key"<<endl;
        }
        else
        {
            if(nodeexists(n->key)!=NULL)//to check if node of to be inserted node already exits using previous function ie-duplicate keys are present 
            {
                cout<<"Node exists with key:"<<n->key<<endl;
            }
            else
            {
                n->link=ptr->link;//the cuurent pointer link is stored to insert node to maintain connection or flow
                ptr->link=n;//to form link of the inserted node..............order of implementing is important to not loose pointer address

            }
        }
    }

    void del(int k)
    {
        if(head==NULL)
        {
            cout<<"Empty list"<<endl;
        }
        else if(head!=NULL)
        {
            if(head->key==k)//if the node to be deleted is the head node
            {
                head=head->link;//head now points to the next node which was previously linked with head
                cout<<"Node unlinked with key value"<<endl;//since the unlinked node acnnot be accessed
            }
            else
            {
                node *t,*preptr,*curptr;
                preptr=head;
                curptr=head->link;//points to the successive node of preptr
                while(curptr->link!=NULL)
                {
                    if(curptr->key==k)//if key matches
                    {
                        t=curptr;//the pointer node is copied to temp
                        curptr=NULL;//the current pointer is made null to terminate while loop
                    }
                    else//to traverse along the sll
                    {
                        preptr=preptr->link;
                        curptr=curptr->link;
                    }
                }
                if(t!=NULL)// temp has some node which was previosuly searched by curptr
                {
                    preptr->link=t->link;//the link of current node to be deleted is stored in link of the previous node to unlink the node
                    cout<<"Node is unlinked from sll"<<endl;
                }
                else
                {
                    cout<<"Node doesnt exist with given key value"<<endl;
                }
            }
        }
    }

    void update(int k,int d)
    {
        node *ptr;
        ptr=nodeexists(k);//node is found using the traverse function and assigned to pointer
        if(ptr!=NULL)
        {
            ptr->data=d;//data of the pointer is updated
            cout<<"Node updated succcessfully"<<endl;
        }
        else
        {
            cout<<"Node doesnt exist"<<endl;
        }
    }

    void display()
    {
        if(head==NULL)
        {
            cout<<"Empty sll"<<endl;
        }
        else
        {
            cout<<"Singlely Linked List is:"<<endl;
            node *ptr;
            ptr=head;
            while(ptr->link!=NULL)
            {
                cout<<ptr->data<<endl;
                ptr=ptr->link;
            }
        }
    }
};

int main()
{
    sll s;
    int c,k,d,key;
    do
    {
        cout<<"Enter option(0 to Terminate):"<<endl;
        cout<<"1.Append a node"<<endl;
        cout<<"2.Prepend a node"<<endl;
        cout<<"3.Insert a node"<<endl;
        cout<<"4.Delete a node"<<endl;
        cout<<"5.Update a node"<<endl;
        cout<<"6.Display"<<endl;
        cin>>c;
        node *n1;
        n1=new node;
        switch(c)
        {
            case 1:
            cout<<"Enter key of node:"<<endl;
            cin>>k;
            cout<<"Enter data:"<<endl;
            cin>>d;
            n1->key=k;
            n1->data=d;
            s.append(n1);
            break;

            case 2:
            cout<<"Enter key of node:"<<endl;
            cin>>k;
            cout<<"Enter data:"<<endl;
            cin>>d;
            n1->key=k;
            n1->data=d;
            s.prepend(n1);
            break;

            case 3:
            cout<<"Enter key after which node is to be inserted:"<<endl;
            cin>>key;
            cout<<"Enter key of node:"<<endl;
            cin>>k;
            cout<<"Enter data:"<<endl;
            cin>>d;
            n1->key=k;
            n1->data=d;
            s.insert(key,n1);
            break;

            case 4:
            cout<<"Enter key of node to be deleted:"<<endl;
            cin>>k;
            s.del(k);
            break;

            case 5:
            cout<<"Enter key of node:"<<endl;
            cin>>k;
            cout<<"Enter data:"<<endl;
            cin>>d;
            s.update(k,d);
            break;

            case 6:
            s.display();
            break;
        }
    }while(c!=0);
    return 0;
}