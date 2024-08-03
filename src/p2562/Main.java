package p2562;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tmp = 0;
        int[] intArr = new int[9];

        for(int i = 0; i < intArr.length; i++){
            intArr[i] = Integer.parseInt(br.readLine());
            if(tmp < intArr[i]){
                tmp = intArr[i];
            }
        }
        bw.write(tmp + "\n");

        for(int i = 0; i < intArr.length; i++){
            if(tmp == intArr[i]){
                tmp = i;
            }
        }
        bw.write(String.valueOf(tmp + 1));
        bw.close();
    }
}