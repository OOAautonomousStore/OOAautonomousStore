package packageInterfaces;

public class Book implements InterfaceTestI {
	String tBooktitle = "";
	String tAuthor = "";
	int iISBN = 0;
	boolean bGekauft = false;

	// Konstruktor
	public Book(String tparameterBooktitle, String tparameterAuthor, int iparameterISBN) {
		tBooktitle = tparameterBooktitle;
		tAuthor = tparameterAuthor;
		iISBN = iparameterISBN;
	}

	// Kaufen Methode aus Interface
	public void Kaufen(boolean bUebergabeGekauft) {
		if (bUebergabeGekauft == true) {
			bGekauft = bUebergabeGekauft;
			System.out.println("Buch wurde gekauft");
		} else {
			bGekauft = bUebergabeGekauft;
			System.out.println("Buch wurde nicht gekauft");
		}
	}

}
