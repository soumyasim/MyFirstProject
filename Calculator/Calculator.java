import java.io.*;
import java.util.*;
public class Calculator
{
    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    private static Scanner sc=new Scanner(System.in);
    public void result(int n1,int n2,char c)
    {
        Calculate obj=new Calculate(n1,c,n2);
        obj.doCalculation();
        obj.getResult();
    }
    public void syn()throws IOException
    {
        Calculator obj=new Calculator();
        char ch;
        do
        {
            System.out.println("Enter the two numbers: ");
            int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            System.out.println("Enter the operator choice: ");
            ch=sc.next().charAt(0);
            obj.result(a,b,ch);
        }while(ch!='n');
    }
}