
public class ArrayDemo5 {
	public static void main(String[] args) {
		int [] array = {4,5,8,1,3};
//		for(int i = 0 ; i < array.length; i++) {
//			System.out.println("array[" + i + "] = " + array[i]);
//		}
		for(int su : array) {        //배열과 컬렉션에서
			System.out.println(su);
		
		}
	}
}
