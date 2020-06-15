package First;
public class Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, Gugu = 0;
		
		for(a = 2; a<=9; a++) {
			System.out.println("** " + a + "´Ü  **");
			for(int i = 1; i<=9; i++) {
				Gugu = a * i ;
				System.out.println(a + " x " + i + " = " + Gugu);
			}
			System.out.println();
		}
		
	}

}