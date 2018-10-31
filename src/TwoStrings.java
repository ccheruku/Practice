import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

    	 for(int i='a';i<='z';i++)
             if(s1.indexOf(i)!=-1&&s2.indexOf(i)!=-1)
                 return "YES" ;
             return "NO" ;
    }

    private static final Scanner scanner = new Scanner("2\nhello\nworld\nhi\nworld");

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/git/Practice/test.txt"));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
