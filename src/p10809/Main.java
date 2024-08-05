package p10809;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String chars = "abcdefghijklmnopqrstuvwxyz";
        char[] charArr = chars.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            System.out.print(input.indexOf(charArr[i]) + " ");
        }

    }
}
