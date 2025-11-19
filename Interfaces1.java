interface parent1
{
abstract void show();
}
interface parent2 extends parent1
{
abstract void show();
}
class Test implements parent2
{
public void show()
{
System.out.println("parent1");
}
public void display()
{
System.out.println("parent2");
}

}
class Interfaces1
{
public static void main(String[] args)
{
Test ob = new Test();
ob.show();
ob.display();
}
}