package p2444;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int iterations = Integer.parseInt(br.readLine());

        for (int i = 1; i <= iterations; i++) {
            for(int j = iterations; j > i; j--){
                bw.write(" ");
            }

            for(int j = i; j > 0; j--){
                bw.write("*");
            }

            for(int j = i-1; j > 0; j--){
                bw.write("*");
            }

            bw.newLine();
        }

        for (int i = iterations - 1; i > 0; i--) {
            for(int j = iterations; j > i; j--){
                bw.write(" ");
            }

            for(int j = i; j > 0; j--){
                bw.write("*");
            }

            for(int j = i-1; j > 0; j--){
                bw.write("*");
            }

            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
