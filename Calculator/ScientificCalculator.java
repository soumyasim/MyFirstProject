import java.io.*;
import java.util.*;
public class ScientificCalculator extends Calculate 
{
    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    private static Scanner sc=new Scanner(System.in);
    public void result(double n,char c)
    {
        Calculate obj=new Calculate(n,c);
        obj.doCalculation();
        obj.getResult();
    }
    public void synsc()throws IOException
    {
        ScientificCalculator obj=new ScientificCalculator();
        char ch;
        do
        {
            System.out.println("Enter the number: ");
            double a=Double.parseDouble(br.readLine());
            System.out.println("Enter the operator choice: ");
            ch=sc.next().charAt(0);
            obj.result(a,ch);
        }while(ch!='n');
    }
}