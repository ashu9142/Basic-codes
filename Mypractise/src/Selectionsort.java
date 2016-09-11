
public class Selectionsort {
public  static void Selectionsort(int[]arr){
	for(int i=0;i<arr.length;i++){
		int index=i;
		for(int j=i+1;j<arr.length;j++){
			if(arr[j]<arr[index]){
				index=j;
				}
		}
	int smallerno=arr[index];
	arr[index]=arr[i];
	arr[i]= smallerno;
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr1={3,79,56,3,4,0,25,1};
System.out.println("array before sort");
for(int i:arr1){
	System.out.println(i+" ");
	
}
System.out.println();
Selectionsort(arr1);
System.out.println("array after sort");
for(int i:arr1){
	System.out.println(i+" ");
	
}
}
}