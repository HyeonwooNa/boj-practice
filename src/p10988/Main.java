package p10988;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            bw.write("1");
        } else
            bw.write("0");

        bw.flush();
    }
}
