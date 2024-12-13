package TwoDArrayDS;
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
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

     public static int hourglassSum(List<List<Integer>> arr) {
        int max=-9999;;
        List<List<Integer>> outArray= new ArrayList<>();
        for (int i=0; i<arr.size()-2;i++) {//rows

            List<Integer> rows= new ArrayList<>();
            for (int j=0; j<arr.size()-2;j++) {
                rows.add(arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+
                        arr.get(i+1).get(j+1)+
                        arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2));
                if(max<rows.get(j)) {                    
                    max= rows.get(j);
                }
            }
            outArray.add(rows);
        }
        return max;
    }

}

public class TwoDArrayDS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
