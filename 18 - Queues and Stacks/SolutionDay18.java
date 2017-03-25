import java.io.*;
import java.util.*;

public class SolutionDay18 {
    // Write your code here.
    private char[] stack= new char[1000];
    private int low=0;
    private int high=0;
    
    private void pushCharacter(char c){
        stack[high]=c;
        high= high+1;
     
    }
    
    private void enqueueCharacter(char c){
       // not required ;)
    }
    
    private char popCharacter(){
        high = high-1;
        char c= stack[high];
        return c;
    }
    
    private char dequeueCharacter(){
        char c= stack[low];
        low= low+1;
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}