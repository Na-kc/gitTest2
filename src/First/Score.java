package First;
import java.util.Scanner;

public class Score { // Practice #5 - ���� ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String string = "\0";
		
		System.out.print("���� �Է�: ");
		int Score = input.nextInt();
		
		if(Score >= 90) {string = "A";}
		else if(Score >= 80) {string = "B";}
		else if(Score >= 70) {string = "C";}
		else if(Score >= 60) {string = "D";}
		else {string = "F";}
		
		System.out.printf("����: %s\n", string);
		input.close();
		
	}

}
