//LAB PROGRAM 1.5
final class Base
{
void show()
{
System.out.println("I am in base");
}
}
class Derived extends Base
{
void show()
{
//super.show();
System.out.println("I am in derived");
}
}
class Finalmethod
{
public static void main(String args[])
{
Derived obj = new Derived();
obj.show();
}
}