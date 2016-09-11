import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepton {

	public static void main(String[] args) {
		int firstno=0;
		int secondno=0;
		int result=0;
		Scanner scanner = new Scanner(System.in);// TODO Auto-generated method stub
System.out.println("enter the first no");
try{
firstno=scanner.nextInt();
}
catch(InputMismatchException e){
	System.out.println("u enter the no is not allowed");
	scanner.nextLine();
	firstno=scanner.nextInt();
}
System.out.println("enter the second no");

	try{
		secondno=scanner.nextInt();
	}
	catch(InputMismatchException e){
		System.out.println("u enter the no is not allowed");
	
	scanner.nextLine();
	secondno=scanner.nextInt();
	}
	try{
		result =firstno/secondno;
	}
	catch(ArithmeticException e){
		System.out.println("you divide a no by 0 ");	
	}
	System.out.println("result"+result);
}
}