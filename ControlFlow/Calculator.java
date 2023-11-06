package controlFlow;

import java.util.Scanner;

public class Calculator {
 
	int num1,num2;
	Calculator()
	{	
		
	}//by default this empty constructor is there in every program
	Calculator (int a,int b) //a&b are local var
	{
		num1 = a;
		num2 = b;
	}
	public static void main(String[] args) {
		int a,b;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter First value:");
	 a=sc.nextInt();
	 System.out.println("Enter Second value:");
	 b=sc.nextInt();
	 
	 Calculator obj=new Calculator(a,b);
	 System.out.println("Enter your Choice[+,-,%,*,/]:");
	 char ch;
	 ch=sc.next().charAt(0);
	 //char array[]=ch.toCharArray();
	 switch (ch)
	 {
	 case '+':System.out.println("Addition is:"+(obj.num1+obj.num2));
	 break;
	 case '-':System.out.println("Substraction is:"+(obj.num1-obj.num2));
	 break;
	 case '%':System.out.println("Modulus is:"+(obj.num1%obj.num2));
	 break;
	 case '*':System.out.println("Multiplication is:"+(obj.num1*obj.num2));
	 break;
	 case '/':System.out.println("Division is:"+(obj.num1/obj.num2));
	 break;
	 default:System.out.println("OOPS!! Invalid Choice");
	 break;
	  } 
	}
}
