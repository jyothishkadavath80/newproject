package newproject;

import java.util.Scanner;

public class markgradeswitchprogram {

	private static final int a = 0;

	public static void main(String[] args, Object grade) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int mark=sc.nextInt();
		int grade1=sc.nextInt();
		switch(mark/10) {
		case 10:
		case 9:
			grade1=a;
			
			System.out.println("A grade");
			break;
		}
		

	}

}
