import java.util.Scanner;

public class GradeChecker {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your score: ");

		int score = scanner.nextInt();

	
		if (score >= 90) {
			System.out.println("Grade is A");
		} else if (score >= 80) {
			System.out.println("Grade is B");
		} else if (score >= 70) { 
			System.out.println("Grade is C");
		} else if (score >= 60) {
			System.out.println("Grade is D");
		} else if (score >= 50) {
			System.out.println("Grade is E");
		} else {
			System.out.println("Grade is F");
		}
	}
}
