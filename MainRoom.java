import java.util.*;

class Room
{
float length,width,height;
void volume()
{
float v = length*width*height;
System.out.println("volume of the Room ="+v);
}
}
class MainRoom
{
public static void main(String[] args)
{
Room r10 = new Room();
r10.length= 20f;
r10.width= 25.7f;
r10.height= 15.5f;
r10.volume();

Room s20 = new Room();
s20.length= 50f;
s20.width= 30f;
s20.height= 40f;
s20.volume();
}
}