package p10818;

import java.io.*;
import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arrLength = br.readLine();
        String[] strArr = br.readLine().split(" ");

        long[] longArr = new long[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            longArr[i] = Long.parseLong(strArr[i]);
        }

        Arrays.sort(longArr);
        System.out.println(longArr[0] + " " + longArr[longArr.length - 1]);
    }
}