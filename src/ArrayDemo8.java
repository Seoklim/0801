import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("제품 몇개 ? :");
		int count = sc.nextInt();
		Product1 [] array = new Product1[count];
		for(Product1 p: array) {
			p = new Product1();
			System.out.print("Name :");
			p.name =  sc.nextLine();
			sc.nextLine();
			System.out.print("price :");
			p.price =  sc.nextInt();
			sc.nextLine();
			System.out.print("color :");
			p.color =  sc.nextLine();

			p.display();
			
		}
		
	}
}
