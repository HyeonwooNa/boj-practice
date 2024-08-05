package p10811;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lengthAndIterations = br.readLine().split(" ");
        int length = Integer.parseInt(lengthAndIterations[0]);
        int iteration = Integer.parseInt(lengthAndIterations[1]);
        int[] buckets = new int[length];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = i + 1;
        }

        for (int i = 0; i < iteration; i++) {
            String[] indexes = br.readLine().split(" ");

            int startIndex = Integer.parseInt(indexes[0]) - 1;
            int endIndex = Integer.parseInt(indexes[1]) - 1;

            for (int j = startIndex; j <= endIndex; j++) {
                int tmp = buckets[j];
                buckets[j] = buckets[endIndex];
                buckets[endIndex] = tmp;
                endIndex -= 1;
            }

        }

        for (int i = 0; i < buckets.length; i++) {
            System.out.print(buckets[i] + " ");
        }
    }
}
