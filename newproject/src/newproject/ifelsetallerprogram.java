package newproject;

import java.util.Scanner;

public class ifelsetallerprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int hight=sc.nextInt();
		if(hight>175) {
			System.out.println(hight+"is tallest student");
			
		}else if(hight>150 && hight<175) {
			System.out.println(hight+"is avarage hight of student");
			
		}else {
			System.out.println(hight+"is shortest hight of student");
		}

	}

}
