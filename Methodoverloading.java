import java.util.*;

class Test
{
int a,b,c,d;
double i,j,k,l;
void add(int a, int b, int c)
{
d = a+b+c;
System.out.println("Addition of 3 numbers = "+d);
}
void add(double i, double j, double k)
{
l = i+j+k;
System.out.println("Addition of 3 numbers ="+l);
}
void add(int a, int b)
{
d = a+b;
System.out.println("Addition of 2 numbers ="+d);
}
}

class Methodoverloading
{
public static void main(String[] args)
{
Test cs = new Test();
cs.add(5,6,7);
cs.add(5.6 , 7.2 ,3.6);
cs.add(3 , 4);
}
}