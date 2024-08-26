package basicprograms;
import java.util.*;
public class Blooddonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>18) {
			if(weight>50) {
				System.out.println("you are eligible to donate blood");
			}
		}
		else {
			System.out.println("you are not eligible to donate blood");
		}
	}

}
