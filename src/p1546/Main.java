package p1546;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[] scores = new int[length];
        int maxScore = 0;

        String[] scoresInput = br.readLine().split(" ");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(scoresInput[i]);
        }

        for (int i = 0; i < scores.length; i++) {
            if(maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }

        double result = 0;

        for (int i = 0; i < scores.length; i++) {
            result += (double)scores[i] / maxScore * 100;
        }
        System.out.println(result / length);
    }
}
