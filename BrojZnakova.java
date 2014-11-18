import java.util.Scanner;

public class BrojZnakova {
	public static void main(String[] args) {
		String rijec;
		System.out.println("Unesite vase rijeci ");
		Scanner in = new Scanner(System.in);
		rijec = in.nextLine();
		String bezRazmaka = rijec.replaceAll("\\s", "");
		System.out.println("Ukupan broj slova vasih rijeci je "
				+ (bezRazmaka.length() - 1));

		System.out.println(bezRazmaka);
	}
}
