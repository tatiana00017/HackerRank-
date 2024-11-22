// https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
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

    public static String timeConversion(String s) {
        StringBuilder sb = new StringBuilder(s);
        String format = sb.substring(8, 10);
        int hour=  Integer.parseInt(sb.substring(0, 2));
        if (format.equals("PM")&& hour!=12 ) {
            hour+=12;
            sb.replace(0, 2, String.valueOf(hour));
        } else if (format.equals("AM") && hour==12){
            sb.replace(0, 2, "00");
        }
        sb.delete(8, 10);
        String result= String.valueOf(sb);
        return result;
    }
}

public class Solution {
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
