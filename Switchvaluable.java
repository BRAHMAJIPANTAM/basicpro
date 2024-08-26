package basicprograms;
import java.util.*;
public class Switchvaluable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("high");
			break;
		case 2:
			System.out.println("low");
			break;
		case 3:
			System.out.println("medium");
			break;
			default:
				System.out.println("out of bound");
		}
	}

}
