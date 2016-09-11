class operation{
	int data =50;
	void change(int data){
		data = data+100;
	}
}
public class callbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
operation op= new operation();
System.out.println("before change"+op.data);
op.change(100);
System.out.println("after change"+op.data);
	}

}
