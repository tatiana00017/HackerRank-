// https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
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
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);
        int count;
        int count1=0;
        boolean d=false;
        for (int i = 0; i < b.size(); i++) {
            count=0;
            for (int j = 0; j < a.size(); j++) {
                if (b.get(i)%a.get(j)==0) {
                    count++;
                }
                if (count==a.size()) {
                    count1++;
                }
            }
            }
            if (count1==b.size()) {
                    d=true;
                }
            count1 = 0;
            count = 0;
            int mcm=0;
            if (d==false) {
            } else {
                for (int i = 0; i < a.size(); i++) {
                    if (a.get(a.size()-1)%a.get(i)==0) {
                        count++;
                    }
                }
                if (count==(a.size())) {
                    mcm=a.get(a.size()-1);
                } else {
                    
                    for (int i = 0 ; i < b.get(0);) {
                        i+=(a.get(a.size()-1));
                        count1=0;
                        for (int j = 0; j < a.size(); j++) {
                            if (i%a.get(j)==0) {
                                count1++;
                            }
                        }
                        if (count1==a.size()) {
                            mcm=i;
                            i=b.get(0);
                        }
                    }
                    count1=0;
                }
                int mcmsum=0;
                for (int i = mcm; i <= b.get(0); i++) {
                    mcmsum+=mcm;
                    count=0;
                    for (int j = 0; j < b.size(); j++) {
                        if (b.get(j)%mcmsum==0) {
                            count++;
                        }
                        }
                        if (count==b.size()) {
                            count1++;
                        }
            }
        }
        return count1;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
