interface parent1
{
abstract void display();
}

interface parent2
{
abstract void show();
}

interface parent3 extends parent1, parent2
{
abstract void message();
}

class Test implements parent3
{
public void display()
{
System.out.println("i am in parent1");
}
public void show()
{
System.out.println("i am in parent2");
}
public void message()
{
System.out.println("i am in parent3");
}
}

class Interfaces2
{
public static void main(String[] args)
{
Test ob = new Test();
ob.display();
ob.show();
ob.message();
}
}