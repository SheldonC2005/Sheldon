#include<iostream>
using namespace std;

int main()
{
    int n,i,j,k,temp,gap;
    cout<<"Enter no fo elements:"<<endl;
    cin>>n;
    int a[n];
    cout<<"Enter "<<n<<" elements"<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<"Enter element "<<i+1<<":";
        cin>>a[i];
    }
    /*for(int i=0;i<n-1;i++)                Selection Sort
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
    }*/                          
    /*for(i=1;i<n;i++)                     Insertion Sort
    {
        k=a[i];
        j=i-1;
        while(j>=0 && a[j]>k)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=k;
    }*/
    /*for(i=0;i<n-1;i++)                    BUbble Sort
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
    }*/
    /*for(gap=n/2;gap>=1;gap=gap/2)          Shell Sort
    {
        for(j=gap;j<=n-1;j++)
        {
            for(i=j-gap;i>=0;i=i-gap)
            {
                if(a[i+gap]>a[gap])
                {
                    break;
                }
                else
                {
                    temp=a[i+gap];
                    a[i+gap]=a[i];
                    a[i]=temp;
                }
            }
        }
    }*/
    for(i=0;i<n;i++)
    {
        cout<<a[i]<<"\t";
    }
    return 0;
}