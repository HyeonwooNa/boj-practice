package p2908;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int ddakbam = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < input.length; i++) {
            input[i] = new StringBuilder(input[i]).reverse().toString();
            if(Integer.parseInt(input[i]) > ddakbam){
                ddakbam = Integer.parseInt(input[i]);
            }
        }
        System.out.println(ddakbam);
    }
}
