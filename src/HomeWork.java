
public class HomeWork {
	public static void main(String[] args) {
		int [] array = {10,50,44,56,29,30,9,48,84,92};
		int sum = 0;
		double avg;
		int max;
		int min;
		
		System.out.print("배열원본 = ");
		for(int su : array) {
			System.out.printf("%d\t",su);
			sum += su;
			
		}
//		for(int i = 0; i < array.length; i++) {
//			if(i==10)break;
//			max = array[0];
//			if(array[i+1]>array[i]) {
//				max = array[i+1];
//			}			
//		}
		System.out.println(max);
		System.out.println();
		System.out.print("내림차순 = ");
		for(int j = 0; j < array.length -1; j++) {
			for(int k = 0; k < array.length - 1; k++) {
				if(array[k]< array[k+1]) {
					int tmp = array[k];
					array[k] = array[k+1];
					array[k+1] = tmp;
				}
			}
		}

		for(int su : array) {
			System.out.printf("%d\t", su);
		}
		System.out.println();
		System.out.print("오름차순 = ");
		
		for(int j = 0; j < array.length -1; j++) {
			for(int k = 0; k < array.length - 1; k++) {
				if(array[k]> array[k+1]) {
					int tmp = array[k];
					array[k] = array[k+1];
					array[k+1] = tmp;
				}
			}
		}		
		for(int su : array) {
			System.out.printf("%d\t", su);
		}
		
		avg = sum / array.length;
		System.out.println();
		System.out.printf("합계 = %d\n", sum);
		System.out.printf("평균 = %.2f\n", avg);

	}
}
