package metoden;

public class FirstMetode2 {
	
	public int plus (int a, int b  ) {
		int res = a + b ; 
		return res;
	}

	public double plus2 (double a, double b  ) {
		double res = a + b ; 
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstMetode2 f2 = new FirstMetode2();
 f2.plus(88, 12);
 
 double result =  f2.plus2(38.3, 62.7);

 System.out.println("  double result is : " + result );
 
 
 System.out.println(" res is : " + f2.plus(88, 12));
 
 FirstMetode f1 = new FirstMetode(); 
 f1.mal(18, 7);
 
 int a = 8;
 int a2 = 16;
 
 double d = 3.8;
 double d2 = 13.65;
 
 String str = "a + b" ;
 String str2 = " mahamet";
 
 int res = a2 + a ;
 
 double resd = d + d2 ; 
 System.out.println("-------------------\n");
 String resstr = str + " **** " + str2 ;
 
 System.out.println(resstr);
 
	}

}
