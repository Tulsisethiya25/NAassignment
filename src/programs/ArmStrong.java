package programs;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int q=n;
			int r=0;
			while(n>0)
			{
				int t=n%10;
				r=r+t*t*t;
				n=n/10;
			}
			if(r==q) {
				System.out.println("given number is armstrong");
			}
			else 
				System.out.println("given number is not armstrong");
			}
	

}
