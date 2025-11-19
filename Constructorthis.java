class Student
{
String name;
int age;
Student()
{
this("Ajay",19);
}
Student(String n, int a)
{
name=n;
age=a;
}
void display()
{
System.out.println("Name:"+name+",Age:"+age);
}
}
class Constructorthis
{
public static void main(String args[])
{
Student s1=new Student();
s1.display();
}
}