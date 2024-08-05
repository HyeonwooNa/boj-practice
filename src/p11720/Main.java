package p11720;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split("");
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println(sum);
    }
}
