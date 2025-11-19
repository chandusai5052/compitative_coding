//15.write a java program to print week days for using switch case

import java.util.*;

class Switch{
public static void main(String[] args){
int ch;
Scanner sc = new Scanner(System.in);
System.out.println("please choose a number");
System.out.println("enter 1 to 7 numbers only");
ch =  sc.nextInt();
switch(ch){
case 1:
System.out.println("today is monday");
break;
case 2:
System.out.println("today is tuesday");
break;
case 3:
System.out.println("today is wednesday");
break;
case 4:
System.out.println("today is thursday");
break;
case 5:
System.out.println("today is friday");
break;
case 6:
System.out.println("today is saturday");
break;
case 7:
System.out.println("today is sunday");
default:
System.out.println("invalid input..!\n please enter valid number");
}
}
}