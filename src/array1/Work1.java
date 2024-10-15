package array1;
import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int store[]=new int[size];
		System.out.println("Enter array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
	for(int i=0;i<arr.length;i++) {
			store[i]=arr[i]*arr[i];
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<store.length;j++) {
			if(store[j]==arr[i]) {
				System.out.println(arr[i]);
				
			}
				
				
			}
			
			
			
			
		}
		
		
		
		

	}

}
