package p2675;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int iterations = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < iterations; i++) {
            String[] iterationsAndStrings = br.readLine().split(" ");

            int n = Integer.parseInt(iterationsAndStrings[0]);

            for (int j = 0; j < iterationsAndStrings[1].length(); j++){
                for(int k = 0; k < n; k++){
                    st = new StringTokenizer(iterationsAndStrings[1].charAt(j) + "");
                    bw.write(st.nextToken());
                }
            }
            bw.newLine();
        }
        bw.flush();
    }
}

