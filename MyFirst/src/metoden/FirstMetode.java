package metoden;

public class FirstMetode {
	
public void plus (int a, int b  ) {
	int res = a + b ; 
	System.out.println ("resultat plus : " + res );
}
	
public void minus (int a, int b ) {
	int res = a - b ;
	System.out.println ("resultat minus : " + res );
}

public void mal (int a, int b ) {
	int res = a * b ;
	System.out.println ("resultat mal : " + res );
}

public void durch (int a, int b ) {
	int res = a / b ;
	System.out.println ("resultat durch : " + res );
}

public void maldurch (int a, int b, int c ) {
	int res = a * b / c ;
	System.out.println ("resultat maldurch : " + res );
}



	public void autoZahl(String auto , int zahl) {
		int res = 2 + zahl;
		System.out.println (auto + " " + res);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstMetode f = new FirstMetode();
		
		f.plus(12345, 222);
		
		f.minus(12345, 8673);
		
		f.mal(12, 13);
		
		f.durch(184, 2);
		
		f.maldurch(12, 4, 2);
		
		f.autoZahl("BMW", 25);
		
	}

}
