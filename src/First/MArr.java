package First;

public class MArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] idata = {{90,80,80},{85,85,95},{95,70,75},
				{80,80,90},{90,75,80}};
		int i = 0, j = 0;
		int sum = 0;
		double avg = 0;
		
		for(i = 0; i<5; i++) {
			for(j = 0; j<3; j++) {
				sum += idata[i][j];
			}
			
			avg = sum/(double)j;
			
			System.out.printf("ID=%d: ÇÕ°è=%d, Æò±Õ=%5.2f\n", i, sum, avg);
			sum = 0; avg = 0;
		}
		
	}

}
