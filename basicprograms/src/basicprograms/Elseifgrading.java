package basicprograms;
import java.util.*;
public class Elseifgrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks<40) {
			System.out.println("fail");
		}
		else if((marks>=40)&&(marks<60)){
			System.out.println("D grade");
		}
		else if((marks>=60)&&(marks<70)) {
			System.out.println("C grade");
		}
		else if((marks>=70)&&(marks<80)) {
			System.out.println("B grade");
		}
		else if((marks>=80)&&(marks<90)) {
			System.out.println("A grade");
		}
		else {
			System.out.println("A+ grade");
		}
	}

}
