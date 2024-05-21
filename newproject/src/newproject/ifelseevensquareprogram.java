package newproject;

import java.util.Scanner;

public class ifelseevensquareprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		if (num%2==0) {
			int square=num*num;
			System.out.println("the square of the even num"+num+"is"+square);
		}else {
			System.out.println("the number enterd is not even");
		}
		

	}

}
