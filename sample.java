//write a java program to print pass if marks greater than or equal to 35

import java.util.*;
class sample
{
 public static void main(String args[])
{
int m;
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks ");
m=sc.nextInt();
if(m>=35)
{
System.out.println("pass");
System.out.println("congratulations");
}
}
}