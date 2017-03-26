import java.io.*;
import java.util.*;

public class SolutionDay18 {
LinkedList<Character> stack = new LinkedList<Character>();
private void pushCharacter(char c){
   stack.add(c);
}
 private void enqueueCharacter(char c){

    }

    private char popCharacter(){
        char c= stack.getLast();
        return c;
    }

    private char dequeueCharacter(){
        char c= stack.getFirst();
        return c;
    }
    public static void main(String[] args) {

    }
}