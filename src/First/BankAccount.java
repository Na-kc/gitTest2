package First;
import java.util.*;
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("���� 123-456789 (������ : ȫ�浿");
		int account = 10000;
		while(true) {
			System.out.printf("�ܾ� : %d��\n", account);
			String bankwork = input.nextLine();
			int money = 0;
			if(money >= 0) { account += money; }
			else { account -= money; }
			if(account <= 0) {
				System.out.println("�ܾ� : 0�� �Դϴ�");
				break;
			}
		}
		
	}

}
