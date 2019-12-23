package Fibo;

public class Fibonacci {
	public static void main(String[] args) {
		
		int n=1, sum=0;
//		System.out.println(n);
		while(sum<=50) {
			sum= sum+n;
			n=sum-n;
			System.out.println(sum);
			
		}	
		
	}
	

}
