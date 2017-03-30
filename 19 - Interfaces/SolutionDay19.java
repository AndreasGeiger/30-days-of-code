import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
//Write your code here
class Calculator implements AdvancedArithmetic{
 public int divisorSum(int n){
     int Sum = 0;
     int Num = n;
     for(int i=n; i>0; i--){
         if(Num%i ==0){
             Sum+= i;
         }
     }
     return Sum;
 }
}
class SolutionDay19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

      	AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}