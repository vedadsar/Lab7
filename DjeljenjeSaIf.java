import java.util.Scanner;


public class DjeljenjeSaIf {
public static void main(String[] args) {
	int broj1;
	int broj2;
		System.out.println("Unesite prvi broj ");
	    Scanner in = new Scanner(System.in);
	    broj1 = in.nextInt();
	    
	    System.out.println("Unesie drugi broj ");
		Scanner in1 = new Scanner(System.in);
		broj2 = in1.nextInt();
		int razlika = broj1 - broj2;
	 	
	    if(razlika<0){
		System.out.println("Razlika je " +(razlika * (-1)));
	       	    return;    
	    }
	    System.out.println(razlika);
	    
	    }
}
