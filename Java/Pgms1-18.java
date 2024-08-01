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

//Program 19
/*import java.util.Scanner;
class Emp
{
    String name;
    int age;
    float salary;
    Scanner sc=new Scanner(System.in);
    Emp()
    {
        System.out.println("Enter name: ");
        name=sc.next();
        System.out.println("Enter age: ");
        age=sc.nextInt();
        System.out.println("Enter salary: ");
        salary=sc.nextFloat();
    }
    Emp(String name,int age,float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void calculateIncentive()
    {
        double incentive;
        incentive=salary*0.1;
        System.out.println("Incentive: "+incentive);
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Emp emp=new Emp("Sheldon",19,3000);
        System.out.println("Name: "+emp.name);
        System.out.println("Age: "+emp.age);
        System.out.println("Salary: "+emp.salary);
        emp.calculateIncentive();
        Emp emp2=new Emp("Jeevanth",19,5000);
        System.out.println("Name: "+emp2.name);
        System.out.println("Age: "+emp2.age);
        System.out.println("Salary: "+emp2.salary);
        emp2.calculateIncentive();
        Emp emp3=new Emp();
        emp3.calculateIncentive();
    }
}*/

//Program 20
/*import java.util.Scanner;
class Student
{
    String name;
    String regno;
    int m1,m2,total;
    Scanner sc=new Scanner(System.in);
    Student()
    {
        System.out.println("Enter name: ");
        name=sc.next();
        System.out.println("Enter Reg.No: ");
        regno=sc.next();
        System.out.println("Enter Mark 1: ");
        m1=sc.nextInt();
        System.out.println("Enter Mark 2: ");
        m2=sc.nextInt();
    }
    void total()
    {
        total=m1+m2;
        System.out.println("Total:"+total);
    }
    void disp()
    {
        System.out.println("******************************");
        System.out.println("Name:"+name);
        System.out.println("Reg.No:"+regno);
        System.out.println("Mark 1:"+m1);
        System.out.println("Mark 2:"+m2);
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.disp();
        s1.total();
    }
}*/

//Program 21
/*import java.util.Scanner;
class A
{
    private int a=10;
    private void message()
    {
        System.out.println("Hello World");
    }
    void public_msg()
    {
        message();
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        A obj1=new A();
        obj1.public_msg();
        //obj1.message();
        //System.out.println(obj1.a);
    }
}*/

//Program 22
/*package pack;
class A
{
    void message()
    {
        System.out.print("Hello");
    }
}
package pack.*;
class B
{
    public static void main(String args[])
    {
        A obj=new A();
        obj.message();
    }
}*/

//Program 23
/*package pack;
class A
{
    protected void message()
    {
        System.out.print("Hello");
    }
}
package mypack;
import pack.*;
class B extends A
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.message();
    }
}*/

//Program 25
/*class Student
{
    String name;
    int id;
    Student()
    {
        System.out.println("No arg constructor");
    }
    Student(String n,int a)
    {
        name=n;
        id=a;
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Student s1=new Student();
        System.out.println(s1.name+" "+s1.id);
        Student s2=new Student("ABCD",10);
        System.out.print(s2.name+" "+s2.id);
    }
}*/

//Program 26
/*class Poly
{
    int perimeter(int a)
    {
        return 4*a;
    }
    int perimeter(int l,int b)
    {
        return 2*(l+b);
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Poly obj=new Poly();
        System.out.println(obj.perimeter(10));
        System.out.println(obj.perimeter(10,20));
    }
}*/

//Program 27
/*class Animal
{
    void place()
    {
        System.out.println("Lives on earth");
    }
}
class Dog extends Animal
{
    void place()
    {
        System.out.println("Lives in kennel");
    }
}
class Horse extends Animal
{
    void place()
    {
        System.out.println("Lives in barn");
    }
}
class Rabbit extends Animal
{
    void place()
    {
        System.out.println("Lives in burrow");
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Animal A=new Animal();
        A.place();
        A=new Dog();
        A.place();
        A=new Horse();
        A.place();
        A=new Rabbit();
        A.place();
    }
}*/

//Program 28
/*class ObjectPassDemo
{
    int a,b;
    ObjectPassDemo(int i,int j)
    {
        a=i;
        b=j;
    }
    boolean equalTo(ObjectPassDemo obj)
    {
        return (obj.a==a && obj.b==b);
    }
}
public class Pgm1
{
    public static void main(String args[])
    {
        ObjectPassDemo obj1=new ObjectPassDemo(100,22);
        ObjectPassDemo obj2=new ObjectPassDemo(100,22);
        ObjectPassDemo obj3=new ObjectPassDemo(-1,-1);
        System.out.println("obj1==obj2: "+obj1.equalTo(obj2));
        System.out.println("obj1==obj3: "+obj1.equalTo(obj3));
    }
}*/

//Program 29   Returning Object
/*class Sample
{
    int value;
    public Sample(int i)
    {
        value=i;
    }
    public Sample MakeTwice()
    {
        Sample temp=new Sample(value*2);
        return temp;
    }
    public void disp()
    {
        System.out.println(value);
    }
}
public class Pgm1
{
    public static void main(String args[])
    {
        Sample obj1=new Sample(10);
        Sample obj2=obj1.MakeTwice();
        obj2.disp();
    }
}*/

//Program 30  : Can access static variable only within static method
/*class Pgm1
{
    static int a=3;
    static int b=a*4;
    static void meth(int x)
    {
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[])
    {
        meth(42);
    }
}*/

//Program 31  : Static variable and function called without creating an object
/*class StaticDemo
{
    static int a=42,b=99;
    static void callMe()
    {
        System.out.println("a= "+a);
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        StaticDemo.callMe();
        System.out.println(StaticDemo.b);
    }
}*/

//Program 32   : Final Variable
/*class Pgm1
{
    final int speedlimit=90;
    void run()
    {
        speedlimit=400;
    }
    public static void main(String args[])
    {
        Pgm1 obj=new Pgm1();
        obj.run();
    }
}*/

//Program 33  Final Method
/*class Pgm1
{
    final void run()
    {
        System.out.println("Run");
    }
}
class Honda extends Pgm1
{
    void run()
    {
        System.out.println("Safe within 100kmph");
    }
    public static void main(String args[])
    {
        Honda obj=new Honda();
        obj.run();
    }
}*/

//Program 34    Final Class
/*final class Pgm1   
{
    
}
class Honda extends Pgm1
{
    void run()
    {
        System.out.println("Run safe within 100kmph");
    }
    public static void main(String args[])
    {
        Honda obj=new Honda();
        obj.run();
    }
}*/

//Program 35   : Nested Static
/*class OuterA
{
    static int outerx=10;
    int outery=20;
    private static int outerprivate=30;
    static class StaticB
    {
        void disp()
        {
            System.out.println(outerx);
            System.out.println(outerprivate);
            OuterA obj=new OuterA();
            System.out.println(obj.outery);
        }
    }
}
public class Pgm1
{
    public static void main(String args[])
    {
        OuterA.StaticB obj=new OuterA.StaticB();
        obj.disp();
    }
}*/

//Program 36       Nested InnerClass
/*class OuterClass
{
    static int outerx=10;
    int outery=20;
    private int outerprivate=30;
    class InnerClass
    {
        void disp()
        {
            System.out.println(outerx);
            System.out.println(outery);
            System.out.println(outerprivate);
        }
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        OuterClass outerobj=new OuterClass();
        OuterClass.InnerClass innerobj=outerobj.new InnerClass();
        innerobj.disp();
    }
}*/