import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int i=0;
int num=0;
String primeno="";
System.out.println("enter the value of n:");
 int n=scanner.nextInt();
for(i=1;i<=n;i++){
	int counter=0;
	for(num=i;num>=1;num--){
		if(i%num==0){
			counter=counter+1;
		}
	}
	if(counter==2){
		primeno=primeno+i+"";	}
}
System.out.println("prime no from 1to100 are:");
System.out.println(primeno);
	}

}
