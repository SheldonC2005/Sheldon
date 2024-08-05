#include<iostream>
using namespace std;

void insertionsort(int a[],int n)
{
    int i,j,k;
    for(i=1;i<n;i++)
    {
        k=a[i];
        j=i-1;
        while(j>=0 && a[j]>k)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=k;
    }
}

int main()
{
    int n;
    cout<<"Enter no.of elements:"<<endl;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cout<<"Enter element "<<i+1<<endl;
        cin>>a[i];
    }
    cout<<"Before sorting"<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<endl;;
    }
    insertionsort(a,n);
    cout<<"After sorting"<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<endl;
    }
    return 0;
}