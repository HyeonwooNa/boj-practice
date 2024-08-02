package p10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        String[] result = new String[caseNum];

        for (int i = 0; i < caseNum; i++) {
            result[i] = br.readLine();
        }

        for (int i = 0; i < caseNum; i++){
            String[] cal = result[i].split(" ");
            System.out.println(Integer.parseInt(cal[0]) + Integer.parseInt(cal[1]));
        }
    }
}
