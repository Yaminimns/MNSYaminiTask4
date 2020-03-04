package epam4.epam_maven;

import java.util.Scanner;

public class Intrest {
	public static void main(String args[]){
	    System.out.print("Enter SI(1) or CI(2):");
	   	 Scanner sc = new Scanner(System.in);
	   	 int choice = sc.nextInt();
	   	 int p, r, t;
	   	 System.out.print("Enter principal, time and rate:");
	   	 p=sc.nextInt();
	   	 t=sc.nextInt();
	   	 r=sc.nextInt();
	   	IntrestCalculation k= new IntrestCalculation();
		k.cho(choice, p, r, t);
	}

}

class IntrestCalculation {
    double simple(int p, int t, int r){
	   	 double in;
	   	 in = p * t * r;
	   	 in = in / 100;
	   	 return in;
	    }
	    double compound(int p,int t,int r){ 
	   	 double in;
	   	 double k;
	   	 k = r/ 100 ;
	   	 k = k + 1;
	   	 k = Math.pow(k, t);
	   	 in = p * k;
	   	 in = in - p;
	   	 return in;
	    }
	    void cho(int choice, int p,int r, int t){
	   	 if(choice==1){
	   		 System.out.print("hello");
	   		 double k = simple(p,t,r);
	   		 System.out.print("Amount="+(k+p));
	   		 System.out.print("Intrest="+k);
	   	 }
	   	 else {
	   		 double k = compound(p,t,r);
	   		 System.out.print("Intrest="+(k-p));
	   		 System.out.print("Amount="+k);	   	 
	   	 }
	    }
	}
