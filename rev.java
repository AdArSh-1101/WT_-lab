import java.util.*;
public class rev
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s="";
        while(a>0)
        {
            int d=a%10;
            s=s+d+"";
            a/=10;
        }
        System.out.println("reverse="+s);
    }
}