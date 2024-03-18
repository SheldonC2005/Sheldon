#include<iostream>
using namespace std;

int main()
{
    int a[20],i,n,temp,j;
    cout<<"Enter no.of elements:"<<endl;
    cin>>n;
    for(i=0;i<n;i++)
    {
        cout<<"Enter element "<<i+1<<endl;
        cin>>a[i];
    }
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    cout<<"The sorted list is:"<<endl;
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<endl;
    }
}