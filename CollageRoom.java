import java.util.*;

class Collage
{
float x,y,z;
void collageData(float l, float h, float b)
{
x = l;
y = b;
z = h;
}
void volume()
{
float v = x*y*z;
System.out.println("volume="+v);
}
}
class CollageRoom
{
public static void main(String[] args)
{
Collage g3 = new Collage();
g3.collageData(32.4f, 25.7f, 33.6f);
g3.volume();
}
}