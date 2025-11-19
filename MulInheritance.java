//Mul inheritance 
import java.lang.*;

class base
{
void output()
{
System.out.println("this is base class");
}
}
class derived extends base // to excess the base class
{
void display()
{
System.out.println("this is derived class");
}
}
class heritance extends derived // to excess the base class
{
void input()
{
System.out.println("this is heritance class");
}
}

class MulInheritance
{
public static void main(String arg[])
{
derived obj = new derived();
obj.output();
obj.display();
obj.output();
}
}
