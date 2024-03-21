#include<iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter no.of elements:"<<endl;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cout<<"Enter element "<<i<<":"<<endl;
        cin>>a[i];
    }
    for(int i=0;i<n-1;i++)
    {
        int min=i;
        for(int j=i+1;j<n;j++)
        {
            if(a[j]<a[min])
            {
                min=j;
            }
        }
        if(min!=i)
        {
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
    cout<<"Sorted array is:"<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<a[i];
    }
    return 0;
}