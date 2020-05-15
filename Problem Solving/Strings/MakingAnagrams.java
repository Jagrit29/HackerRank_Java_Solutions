import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {

        int fre1[]=new int[256];
        int fre2[]=new int[256];

        for(int i=0;i<s1.length();i++)
        {
            fre1[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            fre2[s2.charAt(i)]++;
        }

        int deletions=0;
        for(int i=0;i<256;i++)
        {
            deletions=deletions+Math.abs(fre1[i]-fre2[i]);
        }
        return deletions;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
