package appPac;

import java.util.ArrayList;

public class SwadList {


	public static void main(String[] args) {
		ArrayList<swadSingh> menuList=new ArrayList<swadSingh>();
		System.out.println("***Welcome to our cafe***");
		System.out.println("---------------------------------------");
		System.out.println("1.            French fries      100Rs/-");
		System.out.println("2.               Burger          60Rs/-");
		System.out.println("3.           Burger with cheese  80Rs/-");
		System.out.println("4.           Veg supreme burger 120Rs/-");
		System.out.println("5.             Jumbo Burger     150Rs/-");
		System.out.println("6.              Cold drink         MRP ");
		System.out.println("7.                Pizza         100Rs/-");
		System.out.println("8.                Exit                 ");
		System.out.println("---------------------------------------");
		System.out.println("*************");
		
		for(int i=1;i<=1;i++) {
			swadSingh ob = new swadSingh();
			System.out.println("French fries:  ");
			ob.setF1(ob.sc.nextInt());
			System.out.println("Burger:  ");
			ob.setF2(ob.sc.nextInt());
			System.out.println("Burger with Cheese: ");
			ob.setF3(ob.sc.nextInt());
			System.out.println("Veg supreme Burger: ");
			ob.setF4(ob.sc.nextInt());
			System.out.println("Jumbo Burger: ");
			ob.setF5(ob.sc.nextInt());
			System.out.println("Cold Drink: ");
			ob.setF6(ob.sc.nextInt());
			System.out.println("Pizza: ");
			ob.setF7(ob.sc.nextInt());
			menuList.add(ob);
		}
		for(swadSingh s : menuList) {
			System.out.println(s);
		}

	}

}
