package First;

public class Star { //Practice #4 - 별표 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0 , j = 1;
		for(i = 1; i<=5; i++) {
			for(j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
