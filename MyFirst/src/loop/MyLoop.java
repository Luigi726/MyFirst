package loop;

public class MyLoop {

	
	public void loop ()  {
		for (int pensil = 0; pensil < 5; pensil++) {
			System.out.println ("BLEISTIFT : " + pensil);
		}
		
	}
	
	public static void main(String[] args) {
		
MyLoop m = new MyLoop ();
m.loop();

	}
	

}
