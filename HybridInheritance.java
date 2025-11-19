//hierarchicalnheritance
import java.util.*;
class parent
{
void out()
{
System.out.println("parent");
}
}
class son extends parent
{
void print()
{
System.out.println("son");
}
}
class daughter extends parent
{
void input()
{
System.out.println("daugher");
}
}
class Hierarchical
{
public static void main(String arg[])
{
son obj=new son();
obj.parent();
obj.daugher();

daughter obj1=new daughter();
obj1.parent();
obj1.son();
