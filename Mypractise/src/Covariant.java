class A{
	A get(){
		return this;
	}
}
class B extends A{
	B get(){
		return this;
	}
	void message(){
		System.out.println("welcome to covariant return type ");
	}
}
public class Covariant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B().get().message();
	}

}
