package p10818;

import java.io.*;
import java.util.*;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int limitLength = Integer.parseInt(br.readLine());

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int[] intArr = new int[limitLength];
        int i = 0;

        while (st.hasMoreTokens()) {
            intArr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(intArr);
        System.out.println(intArr[0] + " " + intArr[intArr.length - 1]);
    }
}
