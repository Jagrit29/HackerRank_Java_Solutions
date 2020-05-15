import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the anagram function below.
    static int anagram(String s) {
        //Odd length;
        if(s.length()%2!=0)
        {
            return -1;
        }

        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2);

        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(hm.containsKey(ch) && hm.get(ch)>0)
            {
                hm.put(ch,hm.get(ch)-1);
            }
            else
            {
                count++;
            }
        }
        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
