package newproject;

import java.util.Scanner;

public class ifelse3digitpositiveprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		if (num>=100 && num<=999) {
			System.out.println(num+"is a 3-digit positive number");
		}else {
			System.out.println(num+"is not a 3-digit positive number");

	}

}
}