package p15552;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long iterations = Long.parseLong(br.readLine());
        int[] vals = new int[(int)iterations];

        for (int i = 0; i < iterations; i++) {
            String[] s = br.readLine().split(" ");
            vals[i] = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
            bw.write(String.valueOf(vals[i]));
            bw.newLine();
        }

        bw.flush();
    }
}
