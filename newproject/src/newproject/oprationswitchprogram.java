package newproject;

import java.util.Scanner;

public class oprationswitchprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int opration=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=0;
		int sum=0;
		int sub=0;
		int mul=0;
		int div=0;
		{
			System.out.println("a=10");
			System.out.println("b=5");
		}
		
		
		switch(opration) {
		case 1:
			result=a=b;
			System.out.println("sum is "+sum);
			break;
		case 2:
			result=a-b;
			System.out.println("sub is"+sub);
			break;
		case 3:
			result=a*b;
			System.out.println("mul is"+mul);
			break;
		case 4:
			result=a/b;
			System.out.println("div is"+div);
			break;
			default:
			System.out.println("invalid choice");
		}

	}

}
