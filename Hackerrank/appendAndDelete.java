// Link to the question: https://www.hackerrank.com/challenges/append-and-delete/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        int i = 0;
        int len_s = s.length();
        int len_t = t.length();
        int len = 0;
        int diff = 0;
        int step = 0;
        if(len_s < len_t)
        {
            len = len_s;
            diff = len_t - len_s;
        }
        else
        {
            len = len_t;
            diff = len_s - len_t;
        }
            
        for(i = 0; i < len; i++)
        {
            if(s.charAt(i) != t.charAt(i))
                break;
        }
        if(i < len)
        {
            step = (len_s - i) + (len_t - i);
            if(k >= step)
                return "Yes";
            else
                return "No";

        }
        else
        {
            //if the strings are equal:
            step = diff;
            k = k-diff;
            if(k >= (2*len))
                return "Yes";
            else
            {
                if(k%2 == 0)
                    return "Yes";
                else
                    return "No";
            }
        }

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
