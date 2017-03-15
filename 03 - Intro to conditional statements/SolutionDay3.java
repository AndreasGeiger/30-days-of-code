import java.util.Scanner;

public class SolutionDay3 {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if(number%2 == 0  && ((number >= 2 && number <= 5) || number >20)){
			System.out.println("Not Weird");
		}
		else {
			System.out.println("Weird");
		}
		scan.close();
	}
}
