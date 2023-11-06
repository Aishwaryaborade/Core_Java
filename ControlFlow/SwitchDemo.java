package controlFlow;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		//Specify no.of day		
		//int day =7;
		System.out.println("Enter your Choice");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		String dayString="";
		//Switch statement
		switch(day)
		{
		//Case Statement
		case 1: dayString="1-Monday";
		break;
		case 2: dayString="2-Tuesday";
		break;
		case 3: dayString="3-Wednesday";
		break;
		case 4: dayString="4-Thursday";
		break;
		case 5: dayString="5-Friday";
		break;
		case 6: dayString="6-Saturday";
		break;
		case 7: dayString="7-Saturday";
		break;
		default:System.out.println("Invalid Choice");
		}
		System.out.println(dayString);
	}

}
