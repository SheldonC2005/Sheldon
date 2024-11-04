import java.io.*;
import java.util.*;
class Buffered_Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try(PrintWriter writer=new PrintWriter("student.txt"))
        {
            System.out.println("Enter n:");
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter number "+(i+1)+":");
                int rating=sc.nextInt();
                writer.println(rating);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            sc.close();
        }
        try(BufferedReader reader=new BufferedReader(new FileReader("student.txt"));
            PrintWriter writer=new PrintWriter("performance.txt");)
        {
            int sum=0;
            int emp=0;;
            String line;
            while((line=reader.readLine())!=null)
            {
                int rating=Integer.parseInt(line);
                sum+=rating;
                emp++;
            }
            double avg=(double)sum/emp;
            String avg1=String.format("%.1f",avg);
            writer.println("Total Score: "+sum);
            writer.println("Average: "+avg1); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try(BufferedReader performanceReader=new BufferedReader(new FileReader("performance.txt")))
        {
            String line;
            while((line=performanceReader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}