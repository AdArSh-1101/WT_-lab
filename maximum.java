import java.util.*;
public class maximum 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 nos. ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if((x>=y)&&(x>=z))
        System.out.println("greatest no = "+x);
        else if((y>=x)&&(y>=z))
        System.out.println("greatest no = "+y);
        else
        System.out.println("greatest no = "+z);

    }
}
