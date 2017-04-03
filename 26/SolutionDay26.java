import java.io.*;
import java.util.*;

public class SolutionDay26 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int dayReturned = scan.nextInt();
    int monthReturned = scan.nextInt();
    int yearReturned = scan.nextInt();

    int dayExpected = scan.nextInt();
    int monthExpected = scan.nextInt();
    int yearExpected = scan.nextInt();

    int monthsLate = monthReturned - monthExpected ;
    int daysLate = dayReturned - dayExpected ;

    if(yearReturned < yearExpected){
        System.out.println("0");
    }else{
    System.out.println((yearReturned - yearExpected != 0 && yearReturned - yearExpected > 0) ? 10000
        : (monthsLate > 0) ? monthsLate * 500
        : (daysLate > 0) ? daysLate * 15
        : 0);
    }
}
}
