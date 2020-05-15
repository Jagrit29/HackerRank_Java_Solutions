import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {

        int count=0;
        String p="";
        /*
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                p=p+s.charAt(i);
                count++;
                hs.add(s.charAt(i));
            }
            else
            {
                if(hs.contains(s.charAt(i)))
                {

                }
            }
        }
        */
        //It will number of unique characters only as rest we can copy as we can also copy substring of length 1;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            hs.add(s.charAt(i));
        }
        return hs.size();
        //return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = stringConstruction(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
