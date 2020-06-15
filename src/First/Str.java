package First;
import java.util.Scanner;
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int tmp = 0;
		String string = input.nextLine();
		String output = "";
		
		//대문자(+32), 소문자(-32)
		for(int i = 0; i < string.length(); i++) {
			tmp = (int)string.charAt(i);
			
			if(('A' <= tmp) && (tmp <= 'Z')) {
				output += (char)(tmp+32);
			}
			else if(('a' <= tmp) && (tmp <= 'z')) {
				output += (char)(tmp-32);
			}
			else { output += (char)(tmp); }
		}
		
		System.out.println(output);
		input.close();
	}

}
