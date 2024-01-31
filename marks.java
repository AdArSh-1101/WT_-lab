import java.util.*;
public class marks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of 5 subjects");
        int a[]=new int[5];int m=0,s=0;
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>=m)
            m=a[i];
            s+=a[i];
        }
        s/=5;
        System.out.println("greatest marks= "+m);
        System.out.println("average marks = "+s);

    }
}