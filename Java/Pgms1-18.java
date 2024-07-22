package Java;

/*class Pgm1
{
    public static void main(String args[])
    {
        int a,b,c;
        a=20;
        b=30;
        c=a+b;
        System.out.print("Answer:"+c);
    }
}*/

/*class Pgm2
{
    public static void main(String args[])
    {
        int a,b,c;
        a=5;
        b=3;
        c=a*b;
        System.out.println("Answer:"+c);
    }
}*/

/*import java.util.Scanner;
class Pgm3
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        a=sc.nextInt();
        System.out.println("Enter b value:");
        b=sc.nextInt();
        c=a*b;
        System.out.println("Answer:"+c);
    }
}*/

/*import java.util.Scanner;
class Pgm4
{
    public static void main(String args[])
    {
        int l,b,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter l value:");
        l=sc.nextInt();
        System.out.println("Enter b value:");
        b=sc.nextInt();
        area=l*b;
        System.out.println("Answer:"+area);
    }
}*/

/*import java.util.Scanner;
class Pgm5
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        a=sc.nextInt();
        if(a>0)
        {
            System.out.print("Positive");
        }
        else
        {
            System.out.print("Negative");
        }
    }
}*/

/*import java.util.Scanner;
class Pgm6
{
    public static void main(String args[])
    {
        int i=1;
        while(i<=100)
        {
            System.out.print(" "+i);
            i++;
        }
    }
}*/

/*import java.util.Scanner;
class Pgm7
{
    public static void main(String args[])
    {
        for(int i=100;i>=1;i--)
        {
            System.out.print(" "+i);
        }
    }
}*/

/*import java.util.Scanner;
class Pgm8
{
    public static void main(String args[])
    {
        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
            {
                System.out.print(" "+i);
            }
        }
    }
}*/

/*import java.util.Scanner;
class Pgm9
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.print(n+"x"+i+"="+n*i+"\n");

        }
    }
}*/

/*import java.util.Scanner;
class Pgm10
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        a=sc.nextInt();
        System.out.println("Enter b value:");
        b=sc.nextInt();
        System.out.println("Enter c value:");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is the Greatest");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is the Greatest");
        }
        else
        {
            System.out.println(c+" is the Greatest");
        }
    }
}*/

/*import java.util.Scanner;
class Pgm11
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.print("Vowel");
            break;
            default:
            System.out.print("Consonant");
        }
    }
}*/

/*import java.util.Scanner;
class Pgm12
{
    public static void main(String args[])
    {
        int i=1;
        do
        {
            if(i%2!=0)
            {
                System.out.print(" "+i);
            }
            i++;
        }while(i<=100);
    }
}*/

/*import java.util.Scanner;
class Pgm13
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        for(int i:arr)
        {
            System.out.print(" "+i);
        }
    }
}*/

/*import java.util.Scanner;
class Pgm14
{
    public static void main(String args[])
    {
        int size=5;
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 numbers:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(" "+arr[i]);
            }
        }
    }  
}*/

/*import java.util.Scanner;
class Pgm15
{
    public static void main(String args[])
    {
        int mark[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter subject marks:");
        for(int i=0;i<5;i++)
        {
            mark[i]=sc.nextInt();
        }
        int total=0;
        float avg;
        for(int i=0;i<5;i++)
        {
            total+=mark[i];
        }
        avg=total/5;
        System.out.println("Total:"+total);
        System.out.println("Average:"+avg);
    }  
}*/

/*import java.util.Scanner;
class Pgm16
{
    public static void main(String args[])
    {
        int n,big;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+n+" values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        big=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>big)
            {
                big=arr[i];
            }
        }
        System.out.print("Biggest:"+big);
    }  
}*/

/*import java.util.Scanner;
class Pgm17
{
    public static void main(String args[])
    {
        int n;
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+n+" values:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }  
}*/

/*import java.util.Scanner;
class Pgm18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        System.out.println("Enter matrix values for A:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix values for B:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println("Resultant matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+c[i][j]);
            }
            System.out.print("\n");
        }
    }  
}*/