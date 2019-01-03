package metoden;

public class MixerSalat {
	
public void salad(String produkt, int zahl, String stuck, double preis ) {

	System.out.println("produkt : " + produkt);
	System.out.println("zahl : " + zahl);
	System.out.println("stuck : " + stuck);
	System.out.println("preis : " + preis + " Fr");
	
	
}

public void auto(int zahl, String auto, String farbe, int preis ) {
	
	System.out.println("zahl : " + zahl);
	System.out.println("auto : " + auto);
	System.out.println("farbe : " + farbe);
	System.out.println("preis : " + preis + " Fr");
	
	
}


	public static void main(String[] args) {

	MixerSalat nicerMixer = new MixerSalat(); 
	
	nicerMixer.salad("Milch", 2, "flaschen", 2.8);
	
	
	
	
	nicerMixer.auto(3, "BMW", "green", 5000 );
	
	
	}

}
