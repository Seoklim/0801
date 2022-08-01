import java.util.Scanner;

public class ArrayDemo7 {
	public static void main(String[] args) {
		System.out.print("학생몇명 ? :");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();  
		sc.nextLine();
		
		Student [] array = new Student[count];

		for(Student std : array) {
			std = new Student();//왼쪽 : 각각의 배열에 들어있는 하나, 오른쪽 : 배열
			System.out.println("Name : ");
			std.name = sc.nextLine();
			System.out.println("hakbun : ");
			std.hakbun = sc.nextLine();
			System.out.println("kor : ");
			std.kor = sc.nextInt();
			System.out.println("eng : ");
			std.eng = sc.nextInt();
			System.out.println("mat : ");
			std.mat = sc.nextInt();
			
			sc.nextLine();
			
			std.calcTot();
			std.calcAvg();
			std.calcGrade();
			
			std.display();
		}

	}
}

