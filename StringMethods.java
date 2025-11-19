//string method lab program
class StringMethods
{
public static void main(String[] args)
{
String s = "Welc ome ";
//Case conversion
System.out.println("Uppercase:"+s.toUpperCase());
System.out.println("Lowercase:"+s.toLowerCase());
//Whitespace removal
System.out.println("Trimmed:"+s.trim());

System.out.println("Starts with'l':"+s.startsWith());
System.out.println("ends with 'e':"+s.endswith());



System.out.println("substring(0,4):"+s.substring(0,4));
//equal check
String s1 = "welcome";
System.out.println("Equals:"+s.equals(s1));
}
}
