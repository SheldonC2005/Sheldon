/*
 * import java.util.*;
 * import java.io.*;
 * class Demo
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * int a;
 * try(PrintWriter data=new PrintWriter("data.txt"))
 * {
 * for(int i=0;i<3;i++)
 * {
 * a=sc.nextInt();
 * data.println(a);
 * }
 * }
 * catch(Exception e)
 * {
 * System.out.println(e);
 * }
 * try(BufferedReader datareader=new BufferedReader(new FileReader("data.txt")))
 * {
 * String temp;
 * int sum=0;
 * while((temp=datareader.readLine())!=null)
 * {
 * int b=Integer.parseInt(temp);
 * sum+=b;
 * }
 * float sum1=sum;
 * float avg1=sum1/3;
 * datareader.close();
 * }
 * catch(Exception e)
 * {
 * System.out.println(e);
 * }
 * try(PrintWriter avg=new PrintWriter("average.txt"))
 * {
 * avg.println(avg1);
 * }
 * catch(Exception e)
 * {
 * System.out.println(e);
 * }
 * try(BufferedReader avgr=new BufferedReader(new FileReader("average.txt")))
 * {
 * String temp2;
 * while((temp2=avgr.readLine())!=null)
 * {
 * o=Float.parseFloat(temp2);
 * }
 * if(o%2==0)
 * {
 * System.out.println(String.format("%.2f",o*o));
 * }
 * else
 * {
 * System.out.println(String.format("%.2f",o*o*o));
 * }
 * avgr.close();
 * }
 * catch(Exception e)
 * {
 * System.out.println(e);
 * }
 * }
 * }
 */