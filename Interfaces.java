//interfaces

interface Room
{
abstract void show();
}
class Test implements Room
{
public void show()
{
System.out.println("hello");
}
}
class Interfaces
{
public static void main(String[] args)
{
Test ob = new Test();
ob.show();
}
}