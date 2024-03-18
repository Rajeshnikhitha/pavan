import java.util.Scanner;
class Addition
{
 public static void main (String args[])
 {
  int a,b,c;
  Scanner sc = new Scanner(System.in);
  System.out.print("enter A value:");
  a=sc.nextInt();
  System.out.print("enter B value:");
  b=sc.nextInt();
  c=a+b;
  System.out.println("Addition of two numbers is:"+c);
 }
}