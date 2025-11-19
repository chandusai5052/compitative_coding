//write a java program to print given number is even or odd

import java.util.*;
import java.lang.class;
class Evenodd {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = sc.nextInt();
if (number % 2 == 0) {
System.out.println(number + " is Even.");
}
else {
System.out.println(number + " is Odd.");
}
}
}
