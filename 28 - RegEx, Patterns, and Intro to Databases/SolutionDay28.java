import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionDay28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> al = new ArrayList<String>();
        String myRegExString = "[a-zA-Z\\s]*";
        Pattern p = Pattern.compile(myRegExString);
        Matcher m;
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            if (emailID.contains("@gmail") ) {
                m = p.matcher(firstName);
                if( m.find()) {
                    al.add(m.group());
                }
            }

        }
        Collections.sort(al);
        for (String element: al) {
            System.out.println(element);
        }
    }
}