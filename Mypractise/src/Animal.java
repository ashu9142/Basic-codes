class Mammal{
	void eat(){
		System.out.println("eat something");
	}
	void drink(){
		System.out.println("drink something");
		
	}
}
	class dog extends Mammal{
		void eat(){
			System.out.println("eat something");
		}
		void drink(){
			System.out.println("drink something");
			
		}
		void smell(){
			System.out.println("dog can smell fast");
		}
	}
	class cat extends Mammal{
		void eat(){
			System.out.println("eat something");
		}
		void drink(){
			System.out.println("drink something");
			
		}
	}
	

public class Animal {
void caller(Mammal Mammal){
	Mammal.drink();
	Mammal.eat();
	if(Mammal instanceof dog){
		dog d=(dog)Mammal;
		d.smell();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal animal = new Animal();
animal.caller(new dog());
animal.caller(new cat());
	}

}
