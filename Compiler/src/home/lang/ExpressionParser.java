package home.lang;

import java.util.Scanner;

public class ExpressionParser {
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 String expression=sc.next();
		 String[] tokens=expression.split(",");
		 if(tokens[0].equalsIgnoreCase("ADD"))
		 {
			 System.out.println(tokens[1]+" + "+tokens[2]);
		 }
		 else
		 {
			 System.out.println("Enter valid string");
		 }
	 }
}