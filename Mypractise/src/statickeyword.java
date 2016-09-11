class studentS{
	int rollno;
	String name;
	static  String collegename ="its";
studentS(int r,String n){
rollno=r;
name=n;
}
void display(){
	System.out.println(rollno +" "+name+" "+collegename);
}

}

public class statickeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

studentS s1=new studentS(111,"äshu");
studentS s2=new studentS(100,"rohan");
	s1.display();
	s2.display();
	}

}
