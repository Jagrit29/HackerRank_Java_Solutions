import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//palindrom can be formed if there is only 1 char with odd count;
public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {

        int oddCount=0;
        int evenCount=0;
        int fre[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            fre[s.charAt(i)]++;
        }

        for(int i=0;i<256;i++)
        {
            if(fre[i]%2!=0)
            {
                oddCount++;
                //Can also break if odd Count>1;
            }
            else
            {
                evenCount++;
            }
        }

        if(oddCount>1)
        {
            return "NO";
        }
        else
        {
            return "YES";
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
