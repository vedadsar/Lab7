import java.util.Scanner;

public class BrojeviDo10Hiljada {
	public static void main(String[] args) {
		int broj;

		System.out.println("Unesite vas broj ");
		Scanner in = new Scanner(System.in);
		broj = in.nextInt();

		if (broj < 100) {
			System.out.println("broj je manji od 100");
		}

		else if (broj < 1000) {
			System.out.println("broj je manji od 1000");
		}

		else if (broj < 10000) {
			System.out.println("broj je manji od 10000");
		}

		else {
			System.out.println("pretjerao si");
		}

	}

}
