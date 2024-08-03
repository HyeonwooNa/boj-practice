package p10813;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lengthAndIterations = br.readLine().split(" ");

        int length = Integer.parseInt(lengthAndIterations[0]);
        int iteration = Integer.parseInt(lengthAndIterations[1]);

        String[] result = new String[length];

        for (int i = 0; i < length; i++) {
            result[i] = String.valueOf(i + 1);
        }

        for (int i = 0; i < iteration; i++) {
            String[] indexes = br.readLine().split(" ");
            String tmp = result[Integer.parseInt(indexes[0]) - 1];
            result[Integer.parseInt(indexes[0]) - 1] = result[Integer.parseInt(indexes[1]) - 1];
            result[Integer.parseInt(indexes[1]) - 1] = tmp;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
