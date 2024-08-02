package p2493;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int iterations = Integer.parseInt(br.readLine());
        for (int i = 1; i <= iterations; i++) {
            for(int j = iterations; j > i; j--){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
