import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Code starts Here:-
    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        Stack<Character> stack=new Stack<>();

        //we will push the string to stack;

        int i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i++);
            if(stack.isEmpty())
            {
                stack.push(ch);
            }
            else
            {
                if(stack.peek()==ch)
                {
                    stack.pop();
                }
                else
                {
                    stack.push(ch);
                }
            }
        }

        if(stack.size()==0)
        {
            return "Empty String";
        }
        else
        {
            String s1="";
            while(stack.size()>0)
            {
                s1=stack.pop()+s1;
            }
            return s1;
        }


    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
