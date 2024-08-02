package p11382;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// BigInteger 사용 권장
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        long result = 0;

        String[] inputVals = sc.readLine().split(" ");
        for(int i = 0; i < inputVals.length; i++) {
            result += Long.parseLong(inputVals[i]);
        }
        System.out.println(result);
    }
}
