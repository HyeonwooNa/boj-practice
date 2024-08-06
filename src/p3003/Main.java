package p3003;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int[] originalPieces = {1, 1, 2, 2, 2, 8};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputPieces = br.readLine().split(" ");

        int[] result = new int[originalPieces.length];

        for (int i = 0; i < originalPieces.length; i++) {
            result[i] = originalPieces[i] - Integer.parseInt(inputPieces[i]);
        }

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
