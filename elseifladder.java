//12. write a java program to find minimum of to numbers elseifladder

import java.util.*;
class elseifladder
{
public static void main(String[] args)
{
int a, b, c;
System.out.println("enter the number");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();

if((a>b)&&(a>c))
{
System.out.println("a is minimum");
}
else if(b>c)
{
System.out.println("b is minimum");
}
else
{
System.out.println("c is minimum");
}
}
}