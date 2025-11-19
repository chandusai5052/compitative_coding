//single inheritance 
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
class SingleInheritance
{
public static void main(String arg[])
{
derived obj = new derived();
obj.output();
obj.display();
}
}
