package newproject;

import java.util.Scanner;

public class ifelsetimeprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int time=sc.nextInt();
		int time1=22;	
		if(time<10) {
			System.out.println("Good morning");
		}else if(time<20) {
			System.out.println("Good day");
		}else {
			System.out.println("Good evening");
		}

	}

} 
