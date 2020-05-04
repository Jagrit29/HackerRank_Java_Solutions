import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<s.length();)
        {
            char ch=s.charAt(i);
            hs.add((int)ch-96);
            int combine=(int)ch-96;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                combine+=((int)s.charAt(i)-96);
                hs.add(combine);
                System.out.println(combine);
                i++;
            }
            i++;
        }
        String ans[]=new String[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            if(hs.contains(queries[i]))
            {
                ans[i]="Yes";
            }
            else
            {
               ans[i]="No";
            }
        }
        return ans;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
