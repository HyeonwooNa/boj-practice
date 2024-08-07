package p2941;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String input = br.readLine();

        for (int i = 0; i < croatianAlphabet.length; i++) {
            String tmp = croatianAlphabet[i];
            if (input.contains(tmp)) {
                input = input.replace(tmp, "0");
            }
        }
        System.out.println(input.length());
    }
}
