import java.util.*;
public class sumthree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no n");
        int n=sc.nextInt();int s=0;
        for(int i=0;i<=n;i++)
        {
            if(i%3==0)
            s+=i;
        }
        System.out.print(""+s);
    }
    
}
