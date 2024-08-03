package p10871;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int compareNum = Integer.parseInt(inputs[1]);
        String[] strArr = br.readLine().split(" ");
        for(int i = 0; i < strArr.length; i++) {
            if (compareNum > Integer.parseInt(strArr[i])) {
                System.out.print(strArr[i] + " ");
            }
        }
    }
}
