package programs;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Income:");
		double inc = sc.nextDouble();
		double tax;
		if (inc >= 0 && inc <= 180000) {

			System.out.println("no Need to Pay tax:");

		}

		else if (inc >= 181000 && inc <= 300000)

		{

			System.out.println("on amount " + inc + " Applicable tax=10%");

			tax = inc*10 / 100;


			System.out.println("Total Amount have to Paid=" + tax);

		}

		else if (inc >= 300001 && inc <= 500000)

		{

			System.out.println("on amount " + inc + " Applicable tax=20%");

			tax = inc*20 / 100;


			System.out.println("Total Amount have to Paid=" + tax);

		}

		else if (inc >= 500001 && inc <= 1000000)

		{

			System.out.println("on amount " + inc + " Applicable tax=30%");

			tax = inc*30 / 100;


			System.out.println("Total Amount have to Paid=" + tax);

		}

	}

}
