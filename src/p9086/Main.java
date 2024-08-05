package p9086;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iteration = Integer.parseInt(br.readLine());
        String[] results = new String[iteration];

        for(int i = 0; i < iteration; i++) {
            char[] inputs = br.readLine().toCharArray();

            results[i] = new StringBuilder().append(inputs[0]).append(inputs[inputs.length-1]).toString();
        }

        for(int i = 0; i < iteration; i++) {
            System.out.println(results[i]);
        }
    }
}
