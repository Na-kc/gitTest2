package First;
import java.util.Scanner;
public class Caesar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int tmp = 0;
		System.out.print("원문: ");
		String string = input.nextLine();
		String output = "";
		
		//시저암호 (+3)%26
		for(int i = 0; i < string.length(); i++) {
			tmp = (int)string.charAt(i);
			
			if(('A' <= tmp) && (tmp <= 'Z')) {
				output += (char)('A' + (tmp - 'A' + 3) % 26);
			}
			else if(('a' <= tmp) && (tmp <= 'z')) {
				output += (char)('a' + (tmp - 'a' + 3) % 26);
			}
			else { output += (char)(tmp); }
		}
		
		System.out.println("암호: " + output);
		input.close();
	}

}
