package p10951;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input;

        while((input = br.readLine()) != null && !input.isEmpty()) {
            st = new StringTokenizer(input, " ");
            int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.flush();
    }
}
