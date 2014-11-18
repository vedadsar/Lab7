import java.util.Scanner;


public class DjeljivostSa23456 {
public static void main(String[] args) {
	
	double broj;
		
	System.out.println("Unesite vas broj ");
	Scanner in = new Scanner(System.in);
	broj = in.nextDouble();
	
	if((broj%2==0) && (broj%3==0) && (broj%4==0) && (broj%5==0)){
	System.out.println("broj je djeljiv sa 2,3,4 i 5");
	}
	else{
		System.out.println("Broj nije djeljiv");
	}
		if ((broj%2==0) && (broj%3==0)){
			
			System.out.println("Broj je djeljiv sa 6");
		
	}
		
}
}
