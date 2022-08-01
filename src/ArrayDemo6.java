import java.util.Scanner;

public class ArrayDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student jimin = new Student();
		System.out.println("Name : ");
		jimin.name = sc.nextLine();
		System.out.println("hakbun : ");
		jimin.hakbun = sc.nextLine();
		System.out.println("kor : ");
		jimin.kor = sc.nextInt();
		System.out.println("eng : ");
		jimin.eng = sc.nextInt();
		System.out.println("mat : ");
		jimin.mat = sc.nextInt();
		
		jimin.calcTot();
		jimin.calcAvg();
		jimin.calcGrade();
		jimin.display();

		
	}
}
