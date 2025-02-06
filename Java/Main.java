
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

//Assessment 1

/*import java.util.Scanner;

class Converter
{
    float a,m;
    Converter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter money to be converted:");
        m=sc.nextFloat();
    }
    void dtoi()
    {
        a=m*82;
        System.out.println("Dollar in INR: "+a);
    }
    void itod()
    {
        a=m/82;
        System.out.println("INR in Dollar: "+a);
    }
    void etoi()
    {
        a=m*91;
        System.out.println("Euro in INR: "+a);
    }
    void itoe()
    {
        a=m/91;
        System.out.println("INR in Euro: "+a);
    }
    void ytoi()
    {
        a=(m/2);
        System.out.println("Yen in INR: "+a);
    }
}

public class Pgm1
{
    public static void main(String args[])
    {
        int opt;
        
        do
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("************************");
            System.out.println("Choose converter:");
            System.out.println("Enter 0 to exit");
            System.out.println("1.Dollar to INR");
            System.out.println("2.INR to Dollar");
            System.out.println("3.Euro to INR");
            System.out.println("4.INR to Euro");
            System.out.println("5.Yen to INR");
            System.out.print("Enter option: ");
            opt=sc.nextInt();
            
            switch(opt)
            {
                case 1:
                    Converter obj1=new Converter();
                    obj1.dtoi();
                    break;
                case 2:
                    Converter obj2=new Converter();
                    obj2.itod();
                    break;
                case 3:
                    Converter obj3=new Converter();
                    obj3.etoi();
                    break;
                case 4:
                    Converter obj4=new Converter();
                    obj4.itoe();
                    break;
                case 5:
                    Converter obj5=new Converter();
                    obj5.ytoi();
                    break;
            }
        }while(opt!=0);
    }
}*/

//Program 37
/*class Superclass
{
    void methodSuper()
    {
        System.out.println("Super method");
    }
}
class Subclass extends Superclass
{
    void methodSubClass()
    {
        System.out.println("Subclass Method");
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Subclass obj=new Subclass();
        obj.methodSubClass();
        obj.methodSuper();
    }
}*/

//Program 38
/*class Bird
{
    void fly()
    {
        System.out.println("I am a bird");
    }
}
class Parrot extends Bird
{
    void colour()
    {
        System.out.println("I am green");
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Parrot obj=new Parrot();
        obj.colour();
        obj.fly();
    }
}*/

//Program 39
/*class Bird
{
    void fly()
    {
        System.out.println("I am a bird");
    }
}
class Parrot extends Bird
{
    void colour()
    {
        System.out.println("I am green");
    }
}
class SingingParrot extends Parrot
{
    void whatCanISing()
    {
        System.out.println("I can sing opera");
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        SingingParrot obj=new SingingParrot();
        obj.colour();
        obj.fly();
        obj.whatCanISing();
    }
}*/

//Program 40
/*class Bird
{
    void fly()
    {
        System.out.println("I am a bird");
    }
}
class Parrot extends Bird
{
    void colour()
    {
        System.out.println("I am green");
    }
}
class Crow extends Bird
{
    void colour()
    {
        System.out.println("I am black");
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Parrot obj1=new Parrot();
        obj1.colour();
        obj1.fly();
        Crow obj2=new Crow();
        obj2.colour();
        obj2.fly();
        
    }
}*/

//Program 41
/*class Super1
{
    public void functionSuper1()
    {
        System.out.println("Super 1 function called");
    }
}
class Super2
{
    public void funcionSuper2()
    {
        System.out.println("Super 2 function called");
    }
}
class Sub extends Super1,Super2
{
    public void subFunction()
    {
        System.out.println("Subclass of both");
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Sub obj=new Sub();
        obj.subFunction();
        obj.functionSuper1();
        obj.functionSuper2();
    }
}*/

//Program 44
/*class Animal
{
    public void disp()
    {
        System.out.println("I am an animal");
    }
}
class Dog extends Animal
{
    public void disp()
    {
        System.out.println("I am a dog");
    }
    public void printMessage()
    {
        disp();
        super.disp();
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Dog obj=new Dog();
        obj.printMessage();
    }
}*/

//Program 45
/*package MyPack;
class Balance
{
    String name;
    double bal;
    Balance(String n,double b)
    {
        name=n;
        bal=b;
    }
    void show()
    {
        if(bal<0)
        {
            System.out.println("Name: "+name);
            System.out.println("Balance: "+bal);
        }
    }
}
class Pgm1
{
    public static void main(String args[])
    {
        Balance test=new Balance("J.J.Jasper",-58);
        test.show();
    }
}*/

//Program 46
/*abstract class Bike
{
    abstract void run();
}
class Pgm1 extends Bike
{
    void run()
    {
        System.out.println("Running safely");
    }
    public static void main(String args[])
    {
        Bike obj=new Honda();
        obj.run();
    }
}*/
//                                               MODULE 3-EXCEPTION HANDLING AND MULTI-THREADING
//Program 47
/*import java.util.Scanner;
class Pgm1
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter a value:");
            a=sc.nextInt();
            System.out.println("Enter b value:");
            b=sc.nextInt();
            c=a/b;
            System.out.println("Answer:"+c);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
        System.out.println("Rest of the code.....");
    }
}*/

//Program 48
/*import java.util.Scanner;
class Pgm1
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter a value:");
            a=sc.nextInt();
            System.out.println("Enter b value:");
            b=sc.nextInt();
            c=a/b;
            System.out.println("Answer:"+c);
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Catch 1");
        }
        catch(ArithmeticException e2)
        {
            System.out.println("Catch 2");
        }
        catch(Exception e3)
        {
            System.out.println("Catch 3");
        }
        System.out.println("Rest of the code.....");
    }
}*/

//Program 49
/*import java.util.Scanner;
class Pgm1
{
    public static void main(String args[])
    {
        try
        {
            int a[]=new int[2];
            System.out.println("Answer: "+a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Catch 1");
        }
        catch(ArithmeticException e2)
        {
            System.out.println("Catch 2");
        }
        catch(Exception e3)
        {
            System.out.println("Catch 3");
        }
        System.out.println("Rest of the code.....");
    }
}*/

//Program 50                                                 Nested try-catch block
/*class Pgm1
{
    public static void main(String args[])
    {
        try
        {
            int a[]=new int[2];
            try
            {
                int c=10/0;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Inside Catch");
            }
        }
        catch(Exception e)
        {
            System.out.println("Outside Catch");
        }
        System.out.println("Rest of the code.....");
    }
}*/

//Program 51
/*import java.util.Scanner;
class Pgm1
{
    public static void main(String args[])
    {
        try
        {
            int a=10/5;
            System.out.println(a);
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught exception");
        }
        finally
        {
            System.out.println("Always executed");
        }
        System.out.println("Rest of the code.....");
    }
}*/

//Program 52
/*class Pgm1
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Inside try");
            int a=10/0;
            System.out.println(a);
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught exception");
        }
        finally
        {
            System.out.println("Always executed");
        }
        System.out.println("Rest of the code.....");
    }
}*/

//Program 53
/*class Pgm1
{
    public static void main(String args[])
    {
        try
        {
            int a=10/0;
            System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught exception");
        }
        finally
        {
            System.out.println("Always executed");
        }
        System.out.println("Rest of the code.....");
    }
}*/

//Program 54
/*class ThrowException                                 //Demo for throw
{
    static void fun()
    {
        try
        {
            throw new NullPointerException();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun");
            throw e;
        }
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main");
        }
    }
}*/

//Program 55                                                Demo for throws
/*class ThrowDemo
{
    static void throwone() throws IllegalAccessException
    {
        System.out.println("Throw one");
        throw new IllegalAccessException();
    }
    public static void main(String args[])
    {
        try
        {
            throwone();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("Caught");
        }
    }
}*/

//Program 56                                               Demo of user defined exception
/*class MyException extends Exception
{
    private int detail;
    MyException(int a)
    {
        detail=a;
    }
    public String toString()                               //built in function of java.lang package
    {
        return "My Exception ["+detail+"]";
    }
}
class ExceptionDemo
{
    static void compute(int a) throws MyException
    {
        System.out.println("Called compute("+a+")");
        if(a>10)
        {
            throw new MyException(a);
        }
        System.out.println("Normal exit");
    }
    public static void main(String args[])
    {
        try
        {
            compute(1);
            compute(20);
        }
        catch(MyException e)
        {
            System.out.println("Caught "+e);
        }
    }
}*/

//Program 57                                                 Demo of user defined exception
/*import java.io.*;
class MyException extends Exception
{
    public MyException(String str)
    {
        System.out.println(str);
    }
}
public class Pgm57
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Mark: ");
        try
        {
            int mark=Integer.parseInt(br.readLine());
            if(mark<0)
            {
                throw new MyException("Negative");
            }
            else
            {
                throw new MyException("Positive");
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}*/

//Program 58
/*class Pgm58                                               //Thread name set and sleep
{
    public static void main(String args[])
    {
        Thread t =Thread.currentThread();
        System.out.println("Current thread: "+t);
        t.setName("My Thread");
        System.out.println("After name change: "+t);
        try
        {
            for(int n=5;n>0;n--)
            {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
    }
}*/

//Program 59                                         Demo of extends Thread Class
/*class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Hello from my thread");
    }
}
public class ThreadDemo
{
    public static void main(String args[])
    {
        MyThread thread=new MyThread();
        thread.start();
    }
}*/

//Program 60                                         Demo of implements Runnable
/*class MyRunnable implements Runnable
{
    public void run()
    {
        System.out.println("Hello");
    }
}
public class MyDemo
{
    public static void main(String args[])
    {
        MyRunnable obj=new MyRunnable();
        Thread t=new Thread(obj);
        t.start();
    }
}*/

//Program 61                                       Demo of Thread creation and Multi Threading with single custom thread and two objects
/*public class MyThread extends Thread
{
    String task;
    MyThread(String task)
    {
        this.task=task;
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(task+" : "+i);
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String args[])
    {
        MyThread th1=new MyThread("Cut the ticket");
        MyThread th2=new MyThread("Show seat number");
        Thread t1=new Thread(th1);
        Thread t2=new Thread(th2);
        t1.start();
        t2.start();
    }
}*/

//Program 62                                      Demo of Multi Threading wih objects of multiple custom threads along with main thread
/*class MyThread1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("1st child thread: "+i);
        }
        System.out.println("1st child exited");
    }
}
class MyThread2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("2nd child thread: "+i);
        }
        System.out.println("2nd child exited");
    }
}
public class Demo
{
    public static void main(String args[])
    {
        MyThread1 th1=new MyThread1();
        Thread t1=new Thread(th1);
        t1.start();
        MyThread2 th2=new MyThread2();
        Thread t2=new Thread(th2);
        t2.start();
        for(int i=0;i<4;i++)
        {
            System.out.println("Main Thread: "+i);
        }
        System.out.println("Main Thread exited");
    }
}*/

//Program 63                                           Demo of Thread Priority
/*public class A implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread());
    }
    public static void main(String args[])
    {
        A a=new A();
        Thread t=new Thread(a,"New Thread");
        System.out.println("Priority of thread: "+t.getPriority());
        System.out.println("Name of thread: "+t.getName());
        t.start();
    }
}*/

//Program 64                                             Demo of setting priority
/*public class B implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread());
    }
    public static void main(String args[])
    {
        B a=new B();
        Thread t=new Thread(a,"New Thread");
        t.setPriority(2);
        System.out.println("Priority of thread: "+t.getPriority());
        System.out.println("Name of thread: "+t.getName());
        t.start();
    }
}*/

//Program 65                                           Demo of Thread Priority with Multiple Threads
/*public class C implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread());
    }
    public static void main(String args[])
    {
        C a=new C();
        Thread t1=new Thread(a,"Thread 1");
        Thread t2=new Thread(a,"Thread 2");
        Thread t3=new Thread(a,"Thread 3");
        t1.setPriority(4);
        t1.setPriority(2);
        t1.setPriority(8);
        t1.start();
        t2.start();
        t3.start();
    }
}*/

//Program 66                                         Creation of Multiple Thread classes and executing with setPriority method
/*class X implements Runnable
{
    public void run()
    {
        System.out.println("Thread X started");
        for(int i=1;i<=4;i++)
        {
            System.out.println("Thread X: "+i);
        }
        System.out.println("Exit from X");
    }
}
class Y implements Runnable
{
    public void run()
    {
        System.out.println("Thread Y started");
        for(int j=1;j<=4;j++)
        {
            System.out.println("Thread Y: "+j);
        }
        System.out.println("Exit from Y");
    }
}
class Z implements Runnable
{
    public void run()
    {
        System.out.println("Thread Z started");
        for(int k=1;k<=4;k++)
        {
            System.out.println("Thread Z: "+k);
        }
        System.out.println("Exit from Z");
    }
}
public class ThreadPriority
{
    public static void main(String args[])
    {
        X x=new X();
        Y y=new Y();
        Z z=new Z();
        Thread t1=new Thread(x);
        Thread t2=new Thread(y);
        Thread t3=new Thread(z);
        t1.setPriority(10);
        System.out.println("Priority of Y before: "+t2.getPriority());
        t2.setPriority(t2.getPriority()+4);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}*/

//Program 67                                           Synchronization in Multi Threading
class Table
{
    synchronized void print(int val)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(val*i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Thread1 extends Thread
{
    Table t;
    Thread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(4);
    }
}
class Thread2 extends Thread
{
    Table t;
    Thread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(6);
    }
}
public class Main
{
    public static void main(String args[])
    {
        Table t=new Table();
        Thread1 t1=new Thread1(t);
        Thread2 t2=new Thread2(t);
        t1.start();
        t2.start();
    }
}

//Program 68                                                  Inter Thread Communication in Multi Threading
/*class A
{
    int i=1,j=1;
    int n;
    boolean flag=true;
    A(int n)
    {
        this.n=n;
    }
    synchronized void deliver()
    {
        while(i<=n)
        {
            if(flag)
            {
                System.out.println("Data delivered "+i);
                i++;
                flag=false;
                notify();
            }
            else
            {
                try
                {
                    wait();
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
    synchronized void recieve()
    {
        while(j<=n)
        {
            if(!flag)
            {
                System.out.println("Data recieved "+j);
                flag=true;
                j++;
                notify();
            }
            else
            {
                try
                {
                    wait();
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
class Thread1 extends Thread
{
    A obj;
    Thread1(A obj)
    {
        this.obj=obj;
    }
    public void run()
    {
        obj.deliver();
    }
}
class Thread2 extends Thread
{
    A obj;
    Thread2(A obj)
    {
        this.obj=obj;
    }
    public void run()
    {
        obj.recieve();
    }
}
public class Comm
{
    public static void main(String args[])
    {
        
        A obj=new A(5);
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
    }
}*/

//JOIN method try
/*import java.util.Scanner;
class Thread1 extends Thread
{
    int a;
    Thread1(int i)
    {
        a=i;
    }
    public void run()
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Thread2 extends Thread
{
    int b;
    Thread2(int i)
    {
        b=i;
    }
    public void run()
    {
        for(int i=1;i<=b;i++)
        {
            for(int j=1;j<=b;j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Thread1 t1=new Thread1(n);
        Thread2 t2=new Thread2(n);
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(Exception e){
        }
        
    }
}*/

//Practise
/*import java.util.Scanner;
class Calc
{
    private int n;
    private boolean isbin;
    private int r;
    Calc(int r)
    {
        this.r=r;
        this.n=0;
        isbin=false;
    }
    void Bin(int n)
    {
        String str=Integer.toBinaryString(n);
        System.out.println("Binary: "+str);
    }
    void Hex(int n)
    {
        String str=Integer.toHexString(n);
        System.out.println("Hexa: "+str);
    }
    public synchronized void printBin()
    {
        while(n<r)
        {
            if(isbin)
            {
                Bin(n);
                isbin=false;
                n++;
                notify();
            }
            else
            {
                try
                {
                    wait();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
    public synchronized void printHex()
    {
        while(n<r)
        {
            if(!isbin)
            {
                Hex(n);
                isbin=true;
                n++;
                notify();
            }
            else
            {
                try
                {
                    wait();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
class T1 extends Thread
{
    Calc obj1;
    T1(Calc obj1)
    {
        this.obj1=obj1;
    }
    public void run()
    {
        obj1.printBin();
    }
}
class T2 extends Thread
{
    Calc obj2;
    T2(Calc obj2)
    {
        this.obj2=obj2;
    }
    public void run()
    {
        obj2.printHex();
    }
}
class Demo
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter range: ");
            int r=sc.nextInt();
            Calc obj=new Calc(r*2);
            T1 t1=new T1(obj);
            T2 t2=new T2(obj);
            t1.start();
            t2.start();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}*/

//                                                          MODULE 4-FILES AND GENERICS

//Program 69                                                Using Buffered Reader Class
/*import java.io.*;
public class ReadingDemo
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String name=" ";
        try
        {
            System.out.print("Enter name: ");
            name=in.readLine();
            System.out.println("Hello, "+name);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            in.close();
        }
    }
}*/

//Program 70                                                   Using Console Class
/*import java.io.*;
public class Pgm
{
    public static void main(String args[])
    {
        String name;
        Console con=System.console();
        if(con!=null)
        {
            name=con.readLine("Enter name: ");
            System.out.println("Hello, "+name);
        }
        else
        {
            System.out.println("Console not available");
        }
    }
}*/

//Program 71                                                       Demo for Write Method
/*public class WritingDemo
{
    public static void main(String args[])
    {
        int list[]=new int[26];
        for(int i=0;i<26;i++)
        {
            list[i]=i+65;
        }
        for(int i:list)
        {
            System.out.write(i);
            System.out.print("\n");
        }
    }
}*/

//Program 72                                                     Using PrintWriter Class
/*import java.io.*;
class Demo
{
    public static void main(String args[])
    {
        double data=52.1;
        try
        {
            PrintWriter output=new PrintWriter("sample.txt");
            output.print(data);
            output.close();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}*/

//Program 73                                      Using PrintWriter class with printf method
/*import java.io.*;
class Demo
{
    public static void main(String args[])
    {
        int age=20;
        try
        {
            PrintWriter output=new PrintWriter("sample.txt");
            output.printf("I am %d years old",age);
            output.close();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
        finally
        {
            System.out.println("Code Execeuted");
        }
    }
}*/

//                                             BYTE STREAM
//Program 74                                   Reading a file using Byte Stream
/*import java.io.*;
public class Demo
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream in=null;
        try
        {
            in=new FileInputStream("sample.txt");
            int c;
            while((c=in.read())!=-1)
            {
                System.out.write(c);
            }
            System.out.println("Reading success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            if(in!=null)
            {
                in.close();
            }
        }
    }
}*/

//Program 75                                   Writing a file using Byte Stream
/*import java.io.*;
import java.util.*;
public class Demo
{
    public static void main(String args[]) throws IOException
    {
        FileOutputStream out=null;
        try
        {
            out=new FileOutputStream("sample.txt");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            byte arr[]=str.getBytes();
            for(int i=0;i<arr.length;i++)
            {
                out.write(arr[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            out.close();
        }
    }
}*/
//                                           CHARACTER STREAM
//Program 76                                 Demo of FileReader
/*import java.io.*;
public class Demo
{
    public static void main(String args[]) throws IOException
    {
        FileReader in=null;
        try
        {
            in=new FileReader("sample.txt");
            int c;
            while((c=in.read())!=-1)
            {
                System.out.write(c);
            }
            System.out.println("Reading success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            if(in!=null)
            {
                in.close();
            }
        }
    }
}*/

//Program 77                                     Demo of FileWriter
/*import java.io.*;
import java.util.*;
public class Demo
{
    public static void main(String args[]) throws IOException
    {
        FileWriter out=null;
        try
        {
            out=new FileWriter("sample.txt");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            char arr[]=str.toCharArray();
            for(int i=0;i<arr.length;i++)
            {
                out.write(arr[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            out.close();
        }
    }
}*/

//Program 78                                                Demo to Append Data
/*import java.io.*;
class FileAppend
{
    public static void main(String args[]) throws IOException
    {
        String data="Append";
        File file=new File("sample.txt");
        FileWriter fr=new FileWriter(file,true);
        fr.write(data);
        fr.close();
    }
}*/

//Program 79                                   Program to read from 1 file and write into another file
/*import java.io.*;
public class Demo
{
    public static void main(String args[]) throws IOException
    {
        FileReader fr=new FileReader("sample.txt");
        FileWriter fw=new FileWriter("sample1.txt");
        String str="";
        int c;
        while((c=fr.read())!=-1)
        {
            str+=(char)c;
        }
        System.out.println(str);
        fw.write(str);
        fr.close();
        fw.close();
    }
}*/

//Program 80                                                Demo of Generic Class
/*public class GenericExample<T>
{
    T obj;
    public GenericExample(T anotherobj)
    {
        this.obj=anotherobj;
    }
    public T getData()
    {
        return this.obj;
    }
    public static void main(String args[])
    {
        GenericExample <Integer> actualobj1=new GenericExample<Integer>(100);
        GenericExample <String> actualobj2=new GenericExample<String>("Java");
        GenericExample <Float> actualobj3=new GenericExample<Float>(25.9f);
        System.out.println(actualobj1.getData());
        System.out.println(actualobj2.getData());
        System.out.println(actualobj3.getData());
    }
}*/

//Program 81                                       Demo of Array List
/*import java.util.*;
public class Demo
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add("one");
        al.add("three");
        al.add(10);
        al.add(5.21);
        al.add(1,"two");
        System.out.println(al);
    }
}*/

//Program 82                                          Demo of UnBound Wild Card with anonymous generic class as paramter
/*import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        List<Integer> list1=Arrays.asList(1,2,3);
        List<Double> list2=Arrays.asList(1.1,2.2,3.3);
        printlist(list1);
        printlist(list2);
    }
    private static void printlist(List <?> list)
    {
        System.out.println(list);
    }
}*/

//Program 83                                     Demo of UpperBound wildcard
/*import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
class Demo
{
    public static void main(String args[])
    {
        List<Integer> list1=Arrays.asList(4,5,6,7);
        System.out.println("Total sum: "+sum(list1));
        List<Double> list2=Arrays.asList(4.1,5.1,6.1,7.1);
        System.out.println("Total sum: "+sum(list2));
    }
    private static double sum(List<? extends Number> list)
    {
        double sum=0;
        for(Number i:list)
        {
            sum+=i.doubleValue();
        }
        return sum;
    }
}*/

//Program 84                          Demo of LowerBound wildcard
/*import java.util.Arrays;
import java.util.List;
class Demo
{
    public static void main(String args[])
    {
        List<Integer> list1=Arrays.asList(4,5,6,7);
        printOnlyIntegerClassorSuperClass(list1);
        List<Number> list2=Arrays.asList(8,9,10,11);
        printOnlyIntegerClassorSuperClass(list2);
    }
    private static void printOnlyIntegerClassorSuperClass(List<? super Integer> list)
    {
        System.out.println(list);
    }
}*/

//Program 85                        Demo of Generic Method
/*import java.util.*;
public class Demo
{
    public static <T> void printArray(T inputArray[])
    {
        for (T element : inputArray)
        {
            System.out.print(element+" ");
        }
    }

    public static void main(String args[])
    {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "Java", "Generics", "Example" };
        System.out.println("Integer Array:");
        printArray(intArray);
        System.out.println("\nString Array:");
        printArray(strArray);
    }
}*/

//Program 86                    Demo of generic method with multiple type parameter
/*public class A
{
    public static <T,U> void printPair(T first,U second)
    {
        System.out.println("First: "+first+" ,Second: "+second);
    }
    public static void main(String args[])
    {
        printPair("Age",25);
        printPair(10.5,true);
    }
}*/

//Program 87                 With Bounded Types
/*import java.uitl.*;
public class Demo
{
    public static <T extends Number> double sum(T a,T b)
    {
        return a.doubleValue()+b.doubleValue();
    }
    public static void main(String args[])
    {
        System.out.println("Sum of integers: "+sum(5,10));
        System.out.println("Sum of doubles: "+sum(4.5,3.2));
    }
}*/

//Program 88                                          Demo of Generic Interface(errors)
/*import java.util.*;
public interface Container<T>
{
    void add(T item);
    T get();
}
public class Demo implements Container<Integer>
{
    private Integer item;
    public void add(Integer item)
    {
        this.item=item;
    }
    public Integer get()
    {
        return item;
    }
}
public class Demo2 implements Container<String>
{
    private String item;
    public void add(String item)
    {
        this.item=item;
    }
    public String get()
    {
        return item;
    }
}
public class Pgm
{
    public static void main(String args[])
    {
        Container<Integer> intContainer=new Demo();
        intContainer.add(123);
        System.out.println(intContainer.get());
        Container<String> stringContainer=new Demo2();
        stringContainer.add("Java");
        System.out.println(stringContainer.get());
    }
}*/

//Program 89                              Demo of Generic SuperClass(Generic Class Hierarchy)
/*import java.io.*;
class Generic1<T>
{
    T obj1;
    Generic1(T obj1)
    {
        this.obj1=obj1;
    }
    T getObj1()
    {
        return obj1;
    }
}
class Generic2<T,V> extends Generic1<T>
{
    V obj2;
    Generic2(T obj1,V obj2)
    {
        super(obj1);
        this.obj2=obj2;
    }
    V getObj2()
    {
        return obj2;
    }
}
class Demo
{
    public static void main(String args[])
    {
        Generic2<String,Integer> x=new Generic2<String,Integer>("value: ",100);
        System.out.println(x.getObj1());
        System.out.println(x.getObj2());
    }
}*/

//Program 90                                     Demo of Non-Generic Super Class(error)
/*import java.io.*;
class NonGen
{
    int i;
    NonGen(int i)
    {
        this.i=i;
    }
    int getVal()
    {
        return i;
    }
}
class Gen<T> extends NonGen
{
    T obj1;
    Gen(T obj1,int i)
    {
        this.obj1=obj1;
        super(i);
    }
    T getObj()
    {
        return obj1;
    }
}
class Demo
{
    public static void main(String args[])
    {
        Gen<String> w=new Gen<String>("Hello",2021);
        System.out.println(w.getObj()+" "+w.getVal());
    }
}*/

//                                                  STRINGS AND LAMBDA EXPRESSIONS

//Program 91                              Demo of toString method
/*class Box
{
    double w,h,d;
    Box(double h,double w,double d)
    {
        this.w=w;
        this.h=h;
        this.d=d;
    }
    public String toString()
    {
        return "Dimensions are "+w+" by "+d+" by "+h;
    }
}
class Demo
{
    public static void main(String args[])
    {
        Box b=new Box(10,12,14);
        String s="Box b: "+b;
        System.out.println(b);
        System.out.println(s);
    }
}*/

//Program 92
/*class Demo
{
    public static void main(String args[])
    {
        String s1="Hello";
        String s2=new String(s1);
        System.out.println(s1.equals(s2));  //Checks content(true)
        System.out.println(s1==s2);         //Checks object reference(false)
    }
}*/

//Program 93: Demo of compareTo()

//Program 94                          Demo of Lambda
/*import java.io.*;
interface If1
{
    boolean fun(int n);
}
class Demo
{
    public static void main(String args[])
    {
        If1 isEven=(n)->(n%2==0);
        if(isEven.fun(21))
        {
            System.out.println("21 is even");
        }
        else
        {
            System.out.println("21 is odd");
        }
    }
}*/

//Program 95                     Demo without and with Lambda
//Without Lambda
/*interface MyName
{
    public void SayMyName();
}
class Demo
{
    public static void main(String args[])
    {
        MyName obj=new MyName()
        {
            public void SayMyName()
            {
                System.out.println("Welcome");
            }
        };
        obj.SayMyName();
    }
}*/
//With Lambda
/*interface MyName
{
    public void SayMyName();
}
class Demo
{
    public static void main(String args[])
    {
        MyName obj=()->{System.out.println("Welcome");};
        obj.SayMyName();
    }
}*/

//Program 96                   Demo with single parameter
/*interface Speaker
{
    public String say(String name);
}
public class Demo
{
    public static void main(String args[])
    {
        Speaker s1=(name)->{return "Hello "+name;};
        System.out.println(s1.say("world"));
    }
}*/

//Program 97                  Demo with multiple parameters
/*interface Mul
{
    public void mul(int a,int b);
}
class Demo
{
    public static void main(String args[])
    {
        Mul obj=(a,b)->{System.out.println("Product: "+a*b);};
        obj.mul(5,2);
    }
}*/