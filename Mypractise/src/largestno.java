import java.util.Scanner;

public class largestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
System.out.println("enter the three no");
Scanner scanner=new Scanner(System.in);
a=scanner.nextInt();
b=scanner.nextInt();
c=scanner.nextInt();
if(a>b){
	System.out.println("a is largest");
	
}
else
if(b>c){
	System.out.println("b is largest");
}
else if(c>a){
	System.out.println(" c is largest ");
}
	}
	

}
