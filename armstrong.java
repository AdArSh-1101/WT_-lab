import java.util.*;
public class armstrong 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();
        int n1=n;
        int s=0,d;
        while(n>0)
        {
            d=n%10;
            s+=d*d*d;
            n/=10;
        }
        if(n1==s)
        System.out.println("it is an armstrong no.");
        else
        System.out.println("not an armstrong no.");
    }
}
