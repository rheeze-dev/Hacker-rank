package TimeConversion;
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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String hour = s.substring(0,2);
        int converted = Integer.parseInt(hour) + 12;
        char checker = s.charAt(8);
        if(checker == 'A') {
            if(hour.equals("12")) {
                return "00" + s.substring(2, 8);
            }
            else {
                return s.substring(0, 8);
            }
        }
        else {
            if(hour.equals("12")) {
                return s.substring(0, 8);
            }
            else {
                return converted + s.substring(2, 8);
            }
        }
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
