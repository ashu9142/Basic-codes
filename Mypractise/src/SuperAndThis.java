class pp{
	int x;
	pp(){
		 x=100;
		System.out.println("pp constructor call"+x);
	}
}
class qq extends pp{
	qq(){
		x=200;
		int sum=x+x;
		System.out.println("qq constructor call"+sum);
	}
}
public class SuperAndThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
qq obj= new qq();

	}

}
