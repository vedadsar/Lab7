import java.util.Scanner;

/** Provjeriti dali unesena rijec ima duplih slova
 * 
 * @author vedadzornic
 *
 */
public class StringRazlicitiZnakovi {
public static void main(String[] args) {
	String unos;
		
	System.out.println("Unesite jednu rijec ");
	Scanner in = new Scanner(System.in);
	unos = in.next();
	
	for(int i=0; i<(unos.length()); i++){
<<<<<<< Updated upstream
	    
            if(unos.contains(unos.charAt(i))) {
            	ne moze zato sto charAt treba prvo pretvoriti u stringove
            	
}
=======
	      String Slova = ""+unos.charAt(i) ;
	      
	     
	      if( unos.contains(Slova))
	    	  
	    	  System.out.println("Ima duplih slova");
	      	      
>>>>>>> Stashed changes
	}
            
}
}
