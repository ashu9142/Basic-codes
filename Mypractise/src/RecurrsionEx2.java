
public class RecurrsionEx2 {
static int count=0;
static void p(){
	count++;//it is for finite times
	if(count<=4){
		System.out.println("hello"+count);
	p();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
p();
	}

}
