class parent{
	parent(){
		System.out.println("parent constructor call");
	}

	class child extends parent{
		child()
		{
			System.out.println("child cons call");		}
	}
}
public class RulessofIclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent.child obj =new parent().new child();
	}

}
