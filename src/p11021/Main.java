package p11021;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int iterations = Integer.parseInt(br.readLine());
        for(int i = 1; i <= iterations; i++) {
            String[] input = br.readLine().split(" ");
            bw.write("Case #" + i + ": ");
            bw.write(String.valueOf(Integer.parseInt(input[0]) + Integer.parseInt(input[1])));
            bw.newLine();
        }
        bw.flush();
    }
}
