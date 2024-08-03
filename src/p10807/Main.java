package p10807;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrLength = Integer.parseInt(br.readLine());
        int counter = 0;
        String[] inputs = br.readLine().split(" ");
        String compareNum = br.readLine();
        for (int i = 0; i < arrLength; i++) {
            if (compareNum.equals(inputs[i])) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
