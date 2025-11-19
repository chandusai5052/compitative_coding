class Addition
{
int a, b, c, d;
float i, j, k, l;
Addition (int a, int b, int c)
{
d = a+b+c;
System.out.println("addition of 3 numbers ="+d);
}
Addition (float i, float j, float k)
{
l = i+j+j;
System.out.println("addition of 3 numbers ="+l);
}
}

class constructor
{
public static void main(String[] args)
{
Addition cr1 = new Addition(1, 2, 3);
Addition cr2 = new Addition(1.0f, 2.5f, 5.4f);
}
}