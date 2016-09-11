class Students implements Cloneable{
	int id;
	String name;
	Students(int id,String name){
		this.id=id;
		this.name=name;
	}
public  Object objectclonning( )throws CloneNotSupportedException {
return super.clone();

}

public static  void main  (String[]args){
	
		// TODO Auto-generated method stub
try{
		Students s1 = new Students(100,"ashu");
Students s2 =(Students)s1.clone();
System.out.println(s1.id+""+s1.name);
System.out.println(s2.id+""+s2.name);
}
catch(CloneNotSupportedException c){
	
	}

	}
	
}
