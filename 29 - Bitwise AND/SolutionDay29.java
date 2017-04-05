import java.io.*;
import java.util.*;

public class SolutionDay29 {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int tcase = in.nextInt();
    	int N = 0, K = 0;

    	for(int t=1;t<=tcase; t++){
    		N = in.nextInt();
    		K = in.nextInt();
    		int max=0;
        	int val=0;

    		for(int i=1;i<N;i++){
        		for(int j=i+1;j<=N;j++){
        			val = i&j;
        			if(val <K && val>max){
        				max = val;
        			}
        		}
        	}
        	System.out.println(max);
    	}
    }
}