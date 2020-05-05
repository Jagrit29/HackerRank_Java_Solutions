import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s1) {

        StringBuffer rev=new StringBuffer(s1);
        rev.reverse();

        String s2=rev.toString();

        for(int i=0;i<s2.length()-1;i++)
        {
            int diff1=Math.abs(s2.charAt(i)-s2.charAt(i+1));
            int diff2=Math.abs(s1.charAt(i)-s1.charAt(i+1));

            if(diff1!=diff2)
            {
                return "Not Funny";
            }
        }
        return "Funny";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
