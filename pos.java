import java.io.*;
class pos
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n<0)
{
System.out.println("Negative number");
}
else if(n>0)
{
System.out.println("positive number");
}
else if(n==0)
{
System.out.println("equal number");
}
else
{
System.out.println("it is character");
}
}
