package ch.kunde;

import java.util.Scanner;

public class Begruessung {

	public static void main(String[] args) {

		Scanner kundenAntwort = new Scanner(System.in);

		System.out.println("Herzlich Willkommen. Bist Du bereits Kunde?");
		System.out.println("1. Ja");
		System.out.println("2. Nein");

		int kundenAbfrageAntwort = kundenAntwort.nextInt();

		if (kundenAbfrageAntwort == 2) {
			System.out.println("Tut mir leid, Du darfst nicht eintreten! Willst Du Dich registrieren?");
			System.out.println("1. Ja");
			System.out.println("2. Nein");
			int kundenRegistrierenAntwort = kundenAntwort.nextInt();
			if (kundenRegistrierenAntwort == 1) {
				System.out.println("Gib Deinen Namen ein:");

				String kundenNameString = kundenAntwort.next();
				System.out.println("Hallo " + kundenNameString + " Gib jetzt bitte deinen Geburtstag ein:");
			}

		} else if (kundenAbfrageAntwort == 1) {
			System.out.println("Scannen Sie den QR Code an der Tür (geben Sie ihre Kunden nummer ein)");
		}
		kundenAntwort.close();
	}
}
