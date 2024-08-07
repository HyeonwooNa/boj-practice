package p1157;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputValues = br.readLine().toUpperCase().split("");

        Set<String> set = new HashSet<>(Arrays.asList(inputValues));
        String[] filtered = set.toArray(new String[0]);

        int[] counts = new int[filtered.length];

        for (int i = 0; i < filtered.length; i++) {

            for (int j = 0; j < inputValues.length; j++) {

                if (filtered[i].equalsIgnoreCase(inputValues[j])) {
                    counts[i]++;
                }

            }

        }

        if (isSame(counts)) {
            System.out.println(filtered[getIndex(counts)]);
        } else {
            System.out.println("?");
        }
    }

    private static int getIndex(int[] intArr) {

        int tmp = getTmp(intArr);

        int index = 0;

        for (int i = 0; i < intArr.length; i++) {

            if (tmp <= intArr[i]) {
                index = i;
            }

        }

        return index;
    }

    private static boolean isSame(int[] intArr) {

        int tmp = getTmp(intArr);

        int counter = 0;

        for (int i = 0; i < intArr.length; i++) {

            if (tmp == intArr[i]) {
                counter++;
            }

        }

        if (counter == 1) {
            return true;
        }

        return false;
    }

    private static int getTmp(int[] intArr) {
        int tmp = 0;

        for (int i = 0; i < intArr.length; i++) {

            if (tmp < intArr[i]) {
                tmp = intArr[i];
            }

        }

        return tmp;
    }

}
