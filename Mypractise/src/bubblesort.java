
public class bubblesort {
	static void Bubblesort(int[]arr ){
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={3,29,0,14,64,80};
System.out.println("before bubble sort");
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]+" ");
}
System.out.println();
Bubblesort(arr);
System.out.println("after bubble sort");
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]+" ");
}
}
}