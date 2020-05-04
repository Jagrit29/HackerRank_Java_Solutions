import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong

        Pattern lowerCase=Pattern.compile("[a-z]");
        Pattern UpperCase=Pattern.compile("[A-Z]");
        Pattern digits=Pattern.compile("[0-9]");
        Pattern special=Pattern.compile("[!@#$%^&*()+-]");

        int charactersMissing=0;

        Matcher lower=lowerCase.matcher(password);
        Matcher upper=UpperCase.matcher(password);
        Matcher dig=digits.matcher(password);
        Matcher spe=special.matcher(password);

        if(lower.find()==false)
        {
            //System.out.println("Hello");
            charactersMissing++;
        }
        if(upper.find()==false)
        {
            System.out.println("Hello");
            charactersMissing++;
        }
        if(dig.find()==false)
        {
            System.out.println("Hello2");
            charactersMissing++;
        }
        if(spe.find()==false)
        {
           // System.out.println("Hello3");
            charactersMissing++;
        }

        System.out.println(charactersMissing);
        if(n+charactersMissing>=6)
        {
            return charactersMissing;
        }
        else
        {
            return charactersMissing + (6-(n+charactersMissing));
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
