package p10810;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lengthAndIterations = br.readLine().split(" ");

        int length = Integer.parseInt(lengthAndIterations[0]);
        int iteration = Integer.parseInt(lengthAndIterations[1]);

        String[] result = new String[length];

        for (int i = 0; i < iteration; i++) {

            String[] indexes = br.readLine().split(" ");
            int startIndex = Integer.parseInt(indexes[0]);
            int endIndex = Integer.parseInt(indexes[1]);
            int tmp = Integer.parseInt(indexes[indexes.length - 1]);

            for(int j = startIndex - 1; j <= endIndex - 1; j++) {
                result[j] = String.valueOf(tmp);
            }

        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == null) {
                result[i] = "0";
            }
            System.out.print(result[i] + " ");
        }
    }
}
