package newproject;

import java.util.Scanner;

public class ifelsepositiveornegativeprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		if (num>0) {
			System.out.println("num is positive");
		}else if(num<0) {
			System.out.println("num is negative");
		}else {
			System.out.println("num is zero");
		}
	}

}
