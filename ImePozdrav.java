import java.util.Scanner;

public class ImePozdrav {
	public static void main(String[] args) {
		String ime;
		System.out.println("Unesite vase ime ");
		Scanner in = new Scanner(System.in);
		ime = in.nextLine();
		System.out.println("Zdravo " + ime);
		System.out.println("Zdravo " + ime.toUpperCase());

	}
}








