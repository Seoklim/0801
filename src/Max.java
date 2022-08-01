
public class Max {
public static void main(String[] args) {
	int [] array = {10,50,44,56,29,30,9,48,84,92};
	int max = array[0];
	int min = array[0];
	
	for(int i = 0; i<array.length; i++) {
		if(max < array[i]) {
			max = array[i];
		}
		if(min > array[i]) {
			min = array[i];
		}
	}
	System.out.println(max);
	System.out.println(min);
}
}
//과제
//입력받은 수를 소인수분해 해서 그 결과를 각 줄에 3개씩 출력하기


//과제
//1부터 100까지 소수를 출력하기