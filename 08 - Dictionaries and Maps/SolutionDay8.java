import java.io.*;
import java.util.*;

public class SolutionDay8 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(factorial(number));
    }

    public static int factorial(int number){
        if(number == 0){
            return 1;
        }
        else {
            return number * factorial(number-1);
        }
    }
}
