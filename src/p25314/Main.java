package p25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long ddakbam = Long.parseLong(br.readLine()) / 4;
        for (int i = 0; i < ddakbam; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
