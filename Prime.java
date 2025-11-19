//21. write a java program to print given prime or not     (lab program 2)

import java.util.*;

class Prime{
public static void main(String[] args){
int n,p,i,j;
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
n = sc.nextInt();
System.out.println("Prime numbers are : ");
for(i=2; i<=n; i++)
{
p=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
p++;
}
if(p==2)
System.out.println("given number is prime");
}
}
}