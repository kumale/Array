package array1;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] num=new int[1];
		System.out.println("Enter your number");
		
			num[1]=sc.nextInt();
		}
		int store[]=new int[10];
		for(int i=0;i<num.length;i++) {
			if(num[i]!=0) {
				for(int j=0;j<=10;j++) {
					store[10]=num[i]*j;
				}
			}
			else
				System.out.println("please rewright your number");
			}
		System.out.println(store);
		}

	}

}
