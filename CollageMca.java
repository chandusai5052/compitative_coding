import java.util.*;


class Collage

{
double x,y,z;
void collageData(float l, float h, float b)
{
x = l;
y = b;
z = h;
}
double volume()
{
return x*y*z;

}
}
class CollageMca
{
public static void main(String[] args)
{
Collage g3 = new Collage();
g3.collageData(32.4f, 25.7f, 33.6f);
vol = g3.volume();
System.out.println("volume of g3="+v);
Collage g5 = new Collage();
g5.CollageData(7f, 45f, 8f);
vol = g5.volume();
System.out.println("volume of g5="+v);
}
}