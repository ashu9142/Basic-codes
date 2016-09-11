import java.util.Scanner;

public class MarksandPercentage {

	public static void main(String[] args) {
	int mark[]=new int[4];
	float t  ;
	float p;
	int i;
	float sum=0;
	System.out.println("enter the marks of 4 subjects");// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
for( i=0;i<4;i++){
	mark[i]=scanner.nextInt();
	sum=sum+mark[i];
}
t=sum/4;
p=t/4*100;
System.out.println(" average marks "+t);
System.out.println("percentage"+p);
scanner.close();
	}

}
