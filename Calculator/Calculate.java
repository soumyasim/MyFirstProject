import java.math.*;
public class Calculate implements iCalc
{
    private static double dblNum1;
    private static char cOperator1;
    private static int iFirstNum1;
    private static int iSecondNum1;
    private static int result;
    private static double sc_result;
    public Calculate()
    {
        this.result=result;
        this.sc_result=sc_result;
    }
    public Calculate(double dblNum,char cOperator)
    {
        dblNum1=dblNum;
        cOperator1=cOperator;
    }
    public Calculate(int iFirstNum,char cOperator,int iSecondNum)
    {
        iFirstNum1=iFirstNum;
        iSecondNum1=iSecondNum;
        cOperator1=cOperator;
    }
    public void doCalculation()
    {
        switch(cOperator1)
        {
            case '+':
            result=iFirstNum1+iSecondNum1;
            break;
            case '-':
            result=iFirstNum1-iSecondNum1;
            break;
            case '*':
            result=iFirstNum1*iSecondNum1;
            break;
            case '/':
            if(checkSecondNum()==true)
            {
                result=iFirstNum1/iSecondNum1;
            }
            break;
            case 's':
            sc_result=Math.sin(dblNum1);
            break;
            case 'c':
            sc_result=Math.cos(dblNum1);
            break;
            case 't':
            sc_result=Math.tan(dblNum1);
            break;
            case 'l':
            sc_result=Math.log(dblNum1);
            break;
            default:
            System.out.println("Calculation in progress....");
            break;
        }
    }
    public void getResult()
    {
        if(checkInt()==true && checkDouble()==false)
        {
            System.out.println("Basic Calculation in progress.....");
            System.out.println("Final Result: "+result);
            result=0;
        }
        else if(checkDouble()==true && checkInt()==false)
        {
            System.out.println("Scientific Calculation in progress.....");
            System.out.println("Final Result: "+sc_result);
            sc_result=0;
        }
    }
    public boolean checkSecondNum()
    {
        if(iSecondNum1==0)
        {
            System.out.println("Divide by zero Error....");
            return false;
        }
        else
        {
            System.out.println("Calculation in progress....");
            return true;
        }
    }
    public boolean checkInt()
    {
        double r1=iFirstNum1*10;
        double r2=iSecondNum1*10;
        if(r1%10==0 && r2%10==0 && r1!=0 &&r2!=0 && sc_result==0 && result!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean checkDouble()
    {
        double a=dblNum1*10;
        if(a%10!=0 && a!=0.0 && result==0 && sc_result!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}