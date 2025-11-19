//

import java.util.*;
class nestedifelse
{
public static void main(String[] args)
{
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number ");
num = sc.nextInt();
if(num > 0)
{
System.out.println("positive number");
if(num%2 == 0)
{
System.out.println("this is even");
}
else
{
System.out.println("this is odd");
}
}
else if (num < 0)
{
System.out.println("negative number");
}
else
{
System.out.println("the number is zero");
}
}
}
