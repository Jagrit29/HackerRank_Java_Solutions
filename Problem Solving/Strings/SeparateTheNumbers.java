import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        //Splitting at each possiblity;
        boolean flag=false;
        if(s.length()==1 || s.length()==0)
        {
            System.out.println("NO");
            return;
        }
        long firstNumber=0;

        for(int i=1;i<=s.length()/2;i++)
        {
            String first=s.substring(0,i);
            //Lets try for this first number;
            firstNumber=Long.parseLong(first);
            //Now here search begins;

            long temp=firstNumber;
            String newNum=Long.toString(temp);

            while(newNum.length()<s.length())
            {
                newNum=newNum+Long.toString(++temp);
                //++temp means new number;
            }

            if(newNum.equals(s))
            {
                flag=true;
                break;
            }
        }

        if(flag==true)
        {
            System.out.println("YES"+" "+firstNumber);
        }
        else
        {
            System.out.println("NO");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
