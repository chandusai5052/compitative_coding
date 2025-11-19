package myinterface;

interface interface1
{
abstract void message();
}

interface interface2
{
abstract void display();
}

class Interfaces4 implements interface1, interface2
{
public void message()
{
System.out.println("I am in interface 1");
}
public void display()
{
System.out.println("I am in interface 2");
}
}

