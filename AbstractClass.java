//lab program 1.4 abstract keyword
abstract class Base
{
abstract void show();
}
class Derived1 extends Base
{
void show()
{
System.out.println("i am in Derived1");
}
}
class Derived2 extends Base
{
void show()
{
System.out.println("i am in Derived2");
}
}
class AbstractClass
{
public static void main(String args[])
{
Derived1 obj1 = new Derived1();
Derived2 obj2 = new Derived2();
obj1.show();
obj2.show();
}
}