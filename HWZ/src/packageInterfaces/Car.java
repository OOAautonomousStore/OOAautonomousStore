package packageInterfaces;

public class Car implements InterfaceTestI {

	int iSpeed = 0;
	int iChassisNr = 0;
	String tILikeBootys = "big is Good";
	boolean bGekauft = false;

	// Konstruktor
	public Car(int iparameterSpeed, int iparameterChassisNr, String tparameterBootyStyle) {
		iSpeed = iparameterSpeed;
		iChassisNr = iparameterChassisNr;
		tILikeBootys = tparameterBootyStyle;
	}

	// Kaufen Methode aus Interface
	public void Kaufen(boolean bUebergabeGekauft) {

		if (bUebergabeGekauft == true) {
			bGekauft = bUebergabeGekauft;
			System.out.println("Auto wurde gekauft");
		} else {
			bGekauft = bUebergabeGekauft;
			System.out.println("Auto wurde nicht gekauft");
		}
	}

}
