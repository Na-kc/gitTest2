package First;

public class ArrAvg { // Practice #6 - �հ�� ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Score = {90,75,85,95,70,75,85,85,95,72};
		int sum = 0;
		int a = 0;
		
		System.out.printf("���� : ");
		
		for(int i : Score) {
			sum += Score[a];
			System.out.printf("%d, ", Score[a]);
			a++;
		}
		System.out.printf("\n");
		double avg = sum/(double)(a);
		
		System.out.printf("�հ� : %d\n", sum);
		System.out.printf("��� :%5.1f\n", avg);
	}

}
