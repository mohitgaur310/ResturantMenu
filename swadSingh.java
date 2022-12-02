package appPac;

import java.util.Scanner;

public class swadSingh {
	int ff=100,bur=60,bwc=80,jb=150,vsb=120,cd=45,pzz=100;
	int f1,f2,f3,f4,f5,f6,f7;
	Scanner sc =new Scanner(System.in);
	int amt=0;
	public void login(int p) {
		
		if(p==1234) {
			System.out.println("Pin matched!!");
			
			
		}else {
			System.out.println("Pin incorrect");
		}
	}
	
	
	public int getF1() {
		return f1;
	}
	public void setF1(int f1) {
		this.f1 = f1;
	}
	public int getF2() {
		return f2;
	}
	public void setF2(int f2) {
		this.f2 = f2;
	}
	public int getF3() {
		return f3;
	}
	public void setF3(int f3) {
		this.f3 = f3;
	}
	public int getF4() {
		return f4;
	}
	public void setF4(int f4) {
		this.f4 = f4;
	}
	public int getF5() {
		return f5;
	}
	public void setF5(int f5) {
		this.f5 = f5;
	}
	public int getF6() {
		return f6;
	}
	public void setF6(int f6) {
		this.f6 = f6;
	}
	public int getF7() {
		return f7;
	}
	public void setF7(int f7) {
		this.f7 = f7;
	}
	
	
	@Override
	public String toString() {
		return "\nYour bill      "	
			+"\n============================="
			+"\nFrench fries 		 : "+ff*f1
			+"\nBurger       		 : "+bur*f2
			+"\nBurger with Cheese   : "+bwc*f3
			+"\nVeg Supreme Burger   : "+vsb*f4
			+"\nJumbo Burger 		 : "+jb*f5
			+"\nCold drink 		     : "+cd*f6
			+"\nPizza 			 	 : "+pzz*f7
			+"\nTotal			     :"+(ff*f1+bur*f2+bwc*f3+vsb*f4+jb*f5+cd*f6+pzz*f7)			
			+"\n=============================="
			+"\nThank you \nVisit again ";			
	}
	

}
