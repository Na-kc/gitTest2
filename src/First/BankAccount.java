package First;
import java.util.*;
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("°èÁÂ 123-456789 (¿¹±ÝÁÖ : È«±æµ¿");
		int account = 10000;
		while(true) {
			System.out.printf("ÀÜ¾× : %d¿ø\n", account);
			String bankwork = input.nextLine();
			int money = 0;
			if(money >= 0) { account += money; }
			else { account -= money; }
			if(account <= 0) {
				System.out.println("ÀÜ¾× : 0¿ø ÀÔ´Ï´Ù");
				break;
			}
		}
		
	}

}
