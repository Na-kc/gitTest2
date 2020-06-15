package First;

public class ArrAvg { // Practice #6 - 합계와 평균
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Score = {90,75,85,95,70,75,85,85,95,72};
		int sum = 0;
		int a = 0;
		
		System.out.printf("점수 : ");
		
		for(int i : Score) {
			sum += Score[a];
			System.out.printf("%d, ", Score[a]);
			a++;
		}
		System.out.printf("\n");
		double avg = sum/(double)(a);
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 :%5.1f\n", avg);
	}

}
