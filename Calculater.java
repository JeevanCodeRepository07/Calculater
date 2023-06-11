package Calculater;

import java.util.Scanner;

public class Calculater {
	public static void main(String[] args) {
		
		int no1,no2,result;
		
		while(true) {
		
		System.out.println("1. Addition :");
		System.out.println("2. Substraction :");
		System.out.println("3. Division :");
		System.out.println("4. Multiplication :");
		System.out.println("5. Exit : ");
		System.out.println("");
		System.out.println("ENTER OPERTAION NUMBER YOU WANT ENTER : ");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Enter number 1 :");
			no1=sc.nextInt();
			System.out.println("Enter number 2");
			no2=sc.nextInt();
			result=no1+no2;
			System.out.println("Addition : "+result);
			break;
			
		case 2: 
			System.out.println("Enter number 1 :");
			no1=sc.nextInt();
			System.out.println("Enter number 2");
			no2=sc.nextInt();
			result=no1-no2;
			System.out.println("Substraction : "+result);
			break;
			
		case 3: 
			System.out.println("Enter number 1 :");
			no1=sc.nextInt();
			System.out.println("Enter number 2");
			no2=sc.nextInt();
			result=no1/no2;
			System.out.println("Division  : "+result);
			break;
			
		case 4: 
			System.out.println("Enter number 1 :");
			no1=sc.nextInt();
			System.out.println("Enter number 2");
			no2=sc.nextInt();
			result=no1*no2;
			System.out.println("Multiplication : "+result);
			break;
			
		default :
			System.out.println("Successfully Exit :");
			System.exit(0);
			
	   }
	  }
	 }
	}
