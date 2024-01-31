import java.util.*;
public class circle 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        double r=sc.nextDouble();
        double a,p;
        p=2*(22/7.0)*r;
        a=(22/7.0)*r*r;
        System.out.println("perimeter = "+p);
        System.out.println("area = "+a);
        
    }
    
}
