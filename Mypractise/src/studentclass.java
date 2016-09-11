class student{
	student(){
		System.out.println("student constructor class");
		Course Course = new Course();
	}
	class Course{
		Course(){
			
		
		System.out.println("Course constructor call");
	}
	}
}
public class studentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student ram = new student();
	}

}
