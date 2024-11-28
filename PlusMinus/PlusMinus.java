package PlusMinus;
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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int c_neg = 0;
    int c_pos = 0;
    int c_zero = 0;
    int n = arr.size();
 for(int i = 0 ; i < n ; i++)
 {
      if(arr.get(i) < 0)
      {
        c_neg += 1;
      }
      if(arr.get(i) > 0)
      {
        c_pos+=1;
      }
      if(arr.get(i) == 0)
      {
        c_zero += 1;
      }
 }
  double pof_pos, pof_neg, pof_zero;
      pof_pos = (double) c_pos / (double) n;
       pof_neg = (double) c_neg / (double) n;
        pof_zero = (double) c_zero / (double) n;
        System.out.println(pof_pos);
         System.out.println(pof_neg);
          System.out.println(pof_zero);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        bufferedReader.readLine().trim();

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
