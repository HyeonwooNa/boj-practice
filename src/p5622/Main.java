package p5622;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split("");
        int applicableNum;
        int sum = 0;
        for (String string : strings) {
            if (string.equals("A") || string.equals("B") || string.equals("C")){
                applicableNum = 3;
                sum += applicableNum;
            } else if (string.equals("D") || string.equals("E") || string.equals("F")){
                applicableNum = 4;
                sum += applicableNum;
            } else if (string.equals("G") || string.equals("H") || string.equals("I")){
                applicableNum = 5;
                sum += applicableNum;
            } else if (string.equals("J") || string.equals("K") || string.equals("L")){
                applicableNum = 6;
                sum += applicableNum;
            } else if (string.equals("M") || string.equals("N") || string.equals("O")){
                applicableNum = 7;
                sum += applicableNum;
            } else if (string.equals("P") || string.equals("Q") || string.equals("R") || string.equals("S")){
                applicableNum = 8;
                sum += applicableNum;
            } else if (string.equals("T") || string.equals("U") || string.equals("V")){
                applicableNum = 9;
                sum += applicableNum;
            } else if(string.equals("W") || string.equals("X") || string.equals("Y") || string.equals("Z")){
                applicableNum = 10;
                sum += applicableNum;
            }
        }


        System.out.println(sum);
    }
}
