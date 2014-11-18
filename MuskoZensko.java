import java.util.Scanner;

public class MuskoZensko {
	public static void main(String[] args) {
		String ime;
		char aSlovo = ('a');
		System.out.println("Unesite vase ime ");
		Scanner in = new Scanner(System.in);
		ime = in.next();
		char zadnjeSlovo = ime.charAt(ime.length() - 1);
		String slovo = Character.toString(zadnjeSlovo);
		String slovoA = Character.toString(aSlovo);

		if (slovo.equals(slovoA)) {
			System.out.println("Vi ste zensko ");

		}

		else
			System.out.println("Vi ste musko ");
	}
}
