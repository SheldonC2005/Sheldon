/*import java.util.*;
class Calc
{
    private int number;
    private boolean isBin;
    private int range;
    public Calc(int range)
    {
        this.range=range;
        this.number=0;
        this.isBin=false;
    }
    void Bin(int n)
    {
        String str1=Integer.toBinaryString(n);
        System.out.println("Binary: "+str1);
    }
    void Hex(int n)
    {
        String str=Integer.toHexString(n);
        System.out.println("Hexadecimal: "+str);
    }
    public synchronized void printBin()
    {
        while(number<range)
        {
            if(isBin)
            {
                Bin(number);
                isBin=false;
                number++;
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
        while(number<range)
        {
            if(!isBin)
            {
                Hex(number);
                isBin=true;
                number++;
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
class MyThread extends Thread
{
    Calc c;
    MyThread(Calc calc)
    {
        c=calc;
    }
    public void run()
    {
        c.printBin();
    }
}
class MyT extends Thread
{
    Calc c2;
    MyT(Calc calc)
    {
        c2=calc;
    }
    public void run()
    {
        c2.printHex();
    }
}
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        Calc calc=new Calc((range*2));
        MyThread binTh=new MyThread(calc);
        MyT hexTh=new MyT(calc);
        hexTh.start();
        binTh.start();
    }
}*/

/*
import java.util.*;
class Print
{
    String str;
    boolean met;
    int n,i=0;
    Scanner sc=new Scanner(System.in);
    Print()
    {
        this.met=false;
    }
    public synchronized void p1()
    {
        if(met)
        {
            str=sc.nextLine();
            System.out.println("Thread 1: "+str);
            i++;
            met=false;
        }
    }
    public synchronized void p2()
    {
        if(!met)
        {
            str=sc.nextLine();
            System.out.println("Thread 2: "+str);
            i++;
            met=true;
        }
    }
}
class T1 extends Thread
{
    Print obj1;
    T1(Print obj1)
    {
        this.obj1=obj1;
    }
    public void run()
    {
        obj1.p1();
    }
}
class T2 extends Thread
{
    Print obj2;
    T2(Print obj2)
    {
        this.obj2=obj2;
    }
    public void run()
    {
        obj2.p2();
    }
}
class Demo
{
    public static void main(String args[])
    {
        Print obj=new Print();
        T1 t1=new T1(obj);
        T2 t2=new T2(obj);
        t1.start();
        t2.start();
    }
}
 */