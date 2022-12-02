package appPac;

import java.util.Scanner;

public class callerClasss {

	public static void main(String[] args) {
		int a=1;
		swadSingh ss =new swadSingh();
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Press '1' to login");
			System.out.println("Press '2' to exit!!");
			System.out.println("Choose your option!!");
			int x=sc.nextInt();
			switch(x) {
				case 1:
					System.out.println("Enter your pin");
					ss.login(sc.nextInt());
					break;
				case 2:
					a=3;
					System.out.println("Your have exited");
					break;	
				default:
					System.out.println("Enter a valid choice!!!");
			}
		}while(a==1);
	}

}
