
public class Product1 {
	String name; 		//멤버 변수, 인스턴스 변수
	int price;
	String color;

void display() {	//멤버메소드
	System.out.printf("이름 = %s, 가격 = %d, 색상 = %s\n", name, price, color);
}
}
//멤버 변수와 멤버 메소드는 반드시 주소로 접근한다.
// 주소는 new할때 생긴다.