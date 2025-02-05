package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you want?");
		int n = in.nextInt();
		
		int[] array = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			array[i] = i;
			
			
			for(int p = 2; p <= (n/2); p++) {
				for(int j = 2*p; j <= n; j = j+p) {
					array[j] = 0;
				}
			}
	
			

		}
		  
			for(int k = 0; k <= n; k++) {
				if(array[k]!=0) {
					System.out.println(array[k] + " ");
				}
			}	


	}

}
