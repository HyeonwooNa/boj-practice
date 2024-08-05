package p11718;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();

            if(input == null || input.isEmpty()){
                break;
            }
            sb.append(input).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
