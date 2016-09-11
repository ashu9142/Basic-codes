class operation1{
	int data = 70;
	void change(operation1 op){
		op.data=op.data+100;
	}
}
public class Callbyvalueop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
operation1 op=new operation1();
System.out.println("beforechange"+op.data);
op.change(op);
System.out.println("after change"+op.data);
	}

}
