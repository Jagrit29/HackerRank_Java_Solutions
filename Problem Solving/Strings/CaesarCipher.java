import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    //ASCII Values:-  a - 97
    //                z - 122
    //                A - 65
    //                Z - 90

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {

        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                int prev=ch; //previously;
                ch=(char)(ch+(k%26));
                if(ch>122 && prev>=97)
                {
                    ch=(char)(ch-26);
                }
                else if(ch>90 && prev<=90)
                {
                    ch=(char)(ch-26);
                }
                s1=s1+ch;
            }
            else
            {
                s1=s1+ch;
            }
        }
        return s1;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
