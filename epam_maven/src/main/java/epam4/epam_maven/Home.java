package epam4.epam_maven;

import java.util.Scanner;

public class Home {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter area of house:");
		float AreaofHome = sc.nextFloat();
		Building k = new Building();
		k.displayoptions();
		int choice = sc.nextInt();
		if(choice==1) {
			k.standard(AreaofHome);
		    }
		else if(choice==2){
			k.abovestandard(AreaofHome);
		    }
		else if(choice==3){
			k.highstandard(AreaofHome);
		    }
		else if(choice==4){
	        k.automatedbuilding(AreaofHome);
	        }
		}
}

class Building{
	public static void displayoptions() {
		System.out.print("The option for buildings associated with building is: \n");
		System.out.print("1->1200 INR for using standard materials. \n");
		System.out.print("2->1500 INR for using above standard materials. \n");
		System.out.print("3->1800 INR for using high standard materials. \n");
		System.out.print("4->2500 INR for using high standard materials with full automation \n");
		System.out.print("Enter choice:(1/2/3/4)");	
	}
	public static void standard(float AreaofHome){
		float price=1200*AreaofHome;
		System.out.print(price);
	}
	public static void abovestandard(float AreaofHome){
		float price=1200*AreaofHome;
		System.out.print(price);
	}
	public static void highstandard(float AreaofHome){
		float price=1200*AreaofHome;
		System.out.print(price);
	}
	public static void automatedbuilding(float AreaofHome){
		float price=1200*AreaofHome;
		System.out.print(price);
	}
}
