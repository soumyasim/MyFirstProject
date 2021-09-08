import java.io.*;
import java.util.*;
public class useCalculate
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char s;
        do
        {
            System.out.println("Enter basic for basic calculation and scientific for scientific calculation: \nPress n to abort................");
            String str=br.readLine();
            s=str.charAt(0);
            if(s=='b')
            {
                System.out.println("Enter the following:  \n1. Enter + for addition\n2. Enter - for substraction\n3. Enter * for multiplication\n4. Enter / for division\n ");
                Calculator obj=new Calculator();
                obj.syn();
            }
            else if(s=='s')
            {
                ScientificCalculator obj=new ScientificCalculator();
                System.out.println("Enter the following:  \n1. Enter sine for sin(x)\n2. Enter cos for cos(x)\n3. Enter tan for tan(x)\n4. Enter log for log(x)\n");
                obj.synsc();
            }
            else
            {
                System.out.println("Wrong choice....Please Enter again......");
            }
        }while(s!='n');
    }
}
            