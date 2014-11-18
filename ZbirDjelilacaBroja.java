import java.util.Scanner;


public class ZbirDjelilacaBroja {
public static void main(String[] args) {
	int broj;
	int zbir = 0;
	
	System.out.println("Unesite vas broj ");
	Scanner in = new Scanner(System.in);
	broj = in.nextInt();
	
	
	
	for (int i=1; i<broj; i++){
		double djelioci = broj/i;
		
		       if (broj%i != 0){
		       }
		    	   
		    	   else{
		        	 
		    zbir = zbir + i;	   
		  				       
	}
		       }
	
	System.out.println(zbir);
}
}
