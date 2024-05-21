package newproject;

import java.util.Scanner;

public class dowhileprogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int i=1;
		do {
			if(i%2==0)
				System.out.println(i);
			i++;
		}while(i<101);

	}

}
