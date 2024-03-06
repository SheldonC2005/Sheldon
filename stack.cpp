#include<iostream>
using namespace std;

class stack
{
    private:
    int top;
    int arr[5];
    public:
    stack()
    {
        top=-1;
        for(int i=0;i<5;i++)
        {
            arr[i]=0;
        }
    }
    bool isempty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    bool isfull()
    {
        if(top==4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void push(int val)
    {
        if(isfull())
        {
            cout<<"Stack overflow"<<endl;
        }
        else
        {
            top++;
            arr[top]=val;
        }
    }
    int pop()
    {
        if(isempty())
        {
            cout<<"Stack underflow"<<endl;
            return 0;
        }
        else
        {
            int popvalue=arr[top];
            arr[top]=0;
            top--;
            return popvalue;
        }
    }
    int count()
    {
        if(isempty())
        {
            cout<<"Stack underflow"<<endl;
            return 0;
        }
        else
        {
            return (top+1);
        }
    }
    int peek(int pos)
    {
        if(isempty())
        {
            cout<<"Stack underflow"<<endl;
            return 0;
        }
        else
        {
            return arr[pos];
        }
    }
    void change(int pos,int value)
    {
        arr[pos]=value;
        cout<<"Item changed at given position"<<endl;
    }
    void display()
    {
        cout<<"Value are:"<<endl;
        for(int i=4;i>=0;i--)
        {
            cout<<arr[i]<<endl;
        }
    }
};

int main()
{
    stack s1;
    int option,position,value;
    do
    {
        cout<<"Enter choice(Enter 0 to exit)"<<endl;
        cout<<"1.Push"<<endl;
        cout<<"2.Pop"<<endl;
        cout<<"3.isempty()"<<endl;
        cout<<"4.isfull()"<<endl;
        cout<<"5.peek()"<<endl;
        cout<<"6.count()"<<endl;
        cout<<"7.change()"<<endl;
        cout<<"8.display()"<<endl;
        cout<<"9.clear screen"<<endl<<endl;
        cin>>option;
        switch(option)
        {
            case 1:
            cout<<"Enter item to push"<<endl;
            cin>>value;
            s1.push(value);
            break;

            case 2:
            cout<<"Popped"<<s1.pop()<<endl;
            break;

            case 3:
            if(s1.isempty())
            {
                cout<<"Stack is empty"<<endl;
            }
            else
            {
                cout<<"Stack is not empty"<<endl;
            }
            break;

            case 4:
            if(s1.isfull())
            {
                cout<<"Stack is full"<<endl;
            }
            else
            {
                cout<<"Stack is not full"<<endl;
            }
            break;

            case 5:
            cout<<"Enter position of element:"<<endl;
            cin>>position;
            cout<<"Value is"<<s1.peek(position)<<endl;
            break;

            case 6:
            cout<<"Count is"<<s1.count()<<endl;
            break;

            case 7:
            cout<<"Enter position"<<endl;
            cin>>position;
            cout<<"Enter value to be entered"<<endl;
            cin>>value;
            s1.change(position,value);
            break;

            case 8:
            cout<<"Function called"<<endl;
            s1.display();
            break;

            case 9:
            system("cls");
            break;

            default:
            cout<<"Enter proper number"<<endl;
        }
    } while (option!=0);
    
    return 0;
}