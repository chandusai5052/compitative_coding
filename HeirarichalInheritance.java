class Base
{
public void message()
{
System.out.println("this is parent class ");
}
}
class Derived extends Base
{
public void show()
{
System.out.println("this is child1  class");
}
}
class Derived1 extends Base
{
public void hello()
{
System.out.println("this is child2 class");
}
}
class HeirarichalInheritance
{
public static void main(String[]args)
{
System.out.println("Heirarichal inherited");
Derived obj=new Derived();
obj.message();
obj.show();
Derived1 obj1=new Derived1();
obj1.message();
obj1.hello();
}
}
