//14.write a java program to perform arithmetic operation
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
System.out.println("monday");
break;
case 2:
System.out.println("tuesday");
break;
case 3:
System.out.println("wednesday");
break;
case 4:
System.out.println("thursday");
break;
case 5:
System.out.println("friday");
break;
case 6:
System.out.println("saturday");
break;
case 7:
System.out.println("sunday");
default:
System.out.println("invalid input..!\n please enter valid number");
}
}
}