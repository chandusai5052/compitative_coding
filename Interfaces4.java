package myinterface;

interface Interface1
{
abstract void message();
}

interface Interface2
{
abstract void display();
}

public class Interfaces4 implements Interface1, Interface2
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

