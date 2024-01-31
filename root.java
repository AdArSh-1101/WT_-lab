/**import java.util.*;
import java.math.*;
public class root
{
   
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter");
        int a=sc.nextInt();
        double s;
        s=Math.pow(a,0.5);
        System.out.println("square root = "+s);

    }
}*/
import java.util.*;
public class root
{
    int d=0;static int t=0;
    int func(int x)
    {
        for(int i=0;i<=9;i++)
        {
            if((d*10+i)>t)
            return (i-1);
        }return();
    }
    void func(int k)
    {
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                if(i*j)
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int a=sc.nextInt();String s=""+a,s2="";
        if(s.length()%2==0)
        {
            for(int i=0;i<s.length();i+=2)
            {
                s2=""+s.charAt(i)+s.charAt(i+1);
                t=Integer.parseInt(s2);


            }
        }
        
    }
}