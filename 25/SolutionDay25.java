import java.io.*;
import java.util.*;

public class SolutionDay25 {

    public static boolean isPrime(int number) {
        for (int div = 2; div * div <= number; div++) {
            if (number % div == 0) return false;
        }

        return number == 1 ? false : true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int tc = 0; tc < cases; tc++) {
            System.out.println(isPrime(in.nextInt()) ? "Prime" : "Not prime");
        }
    }
}
