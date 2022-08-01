
public class Student {
	String name, hakbun; //멤버변수 : static xx, instance varialbe
	int kor, eng, mat, tot;
	double avg;
	char grade;
	
	void calcTot(){ //멤버 메소드, instance method
		tot = kor+ eng+mat;
	}
	void calcAvg(){
		avg = tot/3.;
	}
	void calcGrade(){
		grade = (avg < 100 &&avg >=90) ? 'A' :
			(avg <= 90) ? 'B' :
				(avg <= 80) ? 'C' :
					(avg <= 70) ? 'D' : 'F';
	}
	void display() {
		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%c\n"
				, name, hakbun, kor, eng, mat, tot, avg, grade);
		
	}
}
