#include<iostream>
using namespace std;

class stack
{
    public:
    int top;
    char st[20];
    stack()
    {
        top=-1;
    }
    void push(string s)
    {
        int si=size(s);
        for(int i=0;i<=si;i++)
        {
            top++;
            st[i]=s[i];
        }
        cout<<"String is pushed!!"<<endl;
    }
    void pop()
    {
        cout<<"The reversed string is:"<<endl;
        for(int i=top;i>=0;i--)
        {
            cout<<st[i];
            top--;
        }
        cout<<" "<<endl;
    }
};

int main()
{
    int c;
    string s;
    stack st;
    do
    {
        cout<<"*********************"<<endl;
        cout<<"Enter option:"<<endl;
        cout<<"1.Push"<<endl;
        cout<<"2.Pop reversed string"<<endl;
        cout<<"3.Terminate program"<<endl;
        cin>>c;
        switch(c)
        {
            case 1:
            cout<<"Enter string to be reversed:"<<endl;
            cin>>s;
            st.push(s);
            break;

            case 2:
            st.pop();
            break;
        }
    } while (c!=3);
    return 0;
}