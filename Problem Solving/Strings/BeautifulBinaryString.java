import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulBinaryString function below.

    //My approach is whenever I see 010, I change it to 011;
    //Like whenever I will see 1 surrounded by zero, I will change its next zero to 1.
    static int beautifulBinaryString(String s) {

        if(s.length()<=2)
        {
            return 0;
        }

        int dels=0;

        for(int i=1;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='1' && s.charAt(i-1)=='0' &&
            s.charAt(i+1)=='0')
            {
                dels++;
                s=s.substring(0,i+1)+'1'+s.substring(i+2);
            }
        }

        return dels;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String b = scanner.nextLine();

        int result = beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
