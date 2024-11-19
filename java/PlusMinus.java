// https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static void plusMinus(List<Integer> arr) {
        int p=0;
        int n=0;
        int z=0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)>0) {
                p++;
            } else if(arr.get(i)<0){
                n++;
            } else {
                z++;
            }
        }
        double t=arr.size();
        System.out.printf("%.6f%n",p/t);
        System.out.printf("%.6f%n",n/t);
        System.out.printf("%.6f%n",z/t);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
