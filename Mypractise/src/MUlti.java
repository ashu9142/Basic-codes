
public class MUlti extends Thread {
public void run(){
	System.out.println("thread is running state");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MUlti t1=new MUlti();
t1.start();
	}

}
