package p2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class MainTrickVer {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] inputVals = sc.readLine().split(" ");
        int[] hhMM = new int[inputVals.length];
        for (int i = 0; i < hhMM.length; i++){
            hhMM[i] = Integer.parseInt(inputVals[i]);
        }
        LocalTime alert = LocalTime.of(hhMM[0], hhMM[1]);
        LocalTime result = alert.minusMinutes(45);
        System.out.println(result);
    }
}
