import java.io.*;  
import java.util.*;  
public class lmn
{  
    String s;static double a[],b[],c[],d[];
    lmn()
    {
        s="";
    }
    static int k,t;
    static{
        a=new double[1500];
        b=new double[1500];
        c=new double[1500];
        d=new double[1500];
        k=0;
        t=0;
    }
public void func1()
{  
    String s1="";k=0;
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch==',')
        {s1=s.substring(0,i);
            k=i+1;
            break;}
    }s1.trim();
    Double x=Double.parseDouble(s1);
    a[t]=x;t++;
}  
public void func2()
{  
    String s1="";int p=0;
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch==',')
        p++;
        if(p==2)
        {s1=s.substring(k,i);
            k=i+1;
            break;}
    }s1.trim();
    Double x=Double.parseDouble(s1);
    b[t]=x;
}  
public void func3()
{  
    String s1="";int p=0;
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch==',')
        p++;
        if(p==3)
        {s1=s.substring(k,i);
            k=i+1;
            break;}
    }s1.trim();
    Double x=Double.parseDouble(s1);
    c[t]=x;
}  
public void func4()
{  
    String s1="";int p=0;
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch==',')
        p++;
        if(p==4)
        {s1=s.substring(k,i);break;}
    }s1.trim();
    Double x=Double.parseDouble(s1);
    d[t]=x;k=0;
}  
void fun1()
{
    double m=0.0,mi=a[0],su=0.0;
    for(int i=0;i<150;i++)
    {
        if(a[i]>=m)
        {
            m=a[i];
            
        }
        if(a[i]<=mi)
        {
            mi=a[i];
        }
        su+=a[i];
    }
    System.out.println("max of coloumn 1 ="+m);
    System.out.println("min of coloumn 1 ="+mi);
    System.out.println("average of coloumn 1 ="+(su/150.0));System.out.println();
}
void fun2()
{
    double m=0.0,mi=b[2],su=0.0;
    for(int i=0;i<150;i++)
    {
        if(b[i]>=m)
        {
            m=b[i];
            
        }
        if(b[i]<=mi)
        {
            mi=b[i];
        }
        su+=b[i];
    }
    System.out.println("max of coloumn 2 ="+m);
    System.out.println("min of coloumn 2 ="+mi);
    System.out.println("average of coloumn 2 ="+(su/150.0));
    System.out.println();
}
void fun3()
{
    double m=0.0,mi=c[2],su=0.0;
    for(int i=0;i<150;i++)
    {
        if(c[i]>=m)
        {
            m=c[i];
            
        }
        if(c[i]<=mi)
        {
            mi=c[i];
        }
        su+=c[i];
    }
    System.out.println("max of coloumn 3 ="+m);
    System.out.println("min of coloumn 3 ="+mi);
    System.out.println("average of coloumn 3 ="+(su/150.0));System.out.println();
}
void fun4()
{
    double m=0.0,mi=d[2],su=0.0;
    for(int i=0;i<150;i++)
    {
        if(d[i]>=m)
        {
            m=d[i];
            
        }
        if(d[i]<=mi)
        {
            mi=d[i];
        }
        su+=d[i];
    }
    System.out.println("max of coloumn 4 ="+m);
    System.out.println("min of coloumn 4 ="+mi);
    System.out.println("average of coloumn 4 ="+(su/150.0));System.out.println();
}

public static void main(String args[])throws FileNotFoundException 
{
    lmn ob[]=new lmn[200];
    Scanner sc = new Scanner(new File("C:\\Users\\KIIT\\OneDrive\\Desktop\\program\\WT lab\\New folder\\iris.csv"));  
    sc.useDelimiter(","); int i=0;
    while (sc.hasNext()) 
    {  
        ob[i]=new lmn();
    ob[i].s=sc.nextLine();   i++;
    }   
    for(i=0;i<150;i++)
    {
        ob[i].func1();
        ob[i].func2();
        ob[i].func3();
        ob[i].func4();
    }
    lmn o=new lmn();
    o.fun1();
    o.fun2();
    o.fun3();
    o.fun4();
    sc.close();  
}
}  