package p2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        System.out.println(process(numbers));
    }

    private static int process(String[] dices){
        int counted = count(dices);
        int parsedInt = Integer.parseInt(dices[0]);
        int result = 0;
        switch (counted) {
            case -1:
                result = (Integer.parseInt(dices[dices.length - 1]) * 100) + 1000;
                break;
            case 0:
                Arrays.sort(dices, Collections.reverseOrder());
                result =  Integer.parseInt(dices[0]) * 100;
                break;
            case 1:
                result = (parsedInt * 100) + 1000;
                break;
            case 2:
                result =  (parsedInt * 1000) + 10000;
                break;
        }

        return result;
    }

    private static int count(String[] dices){
        int countVal = 0;
        for (int i = 1; i < dices.length; i++) {
            if (dices[0].equals(dices[i])) {
                    countVal++;
            }
        }

        if (countVal == 0) {
            for (int i = 0; i < dices.length - 1; i++) {
                if (dices[i].equals(dices[dices.length - 1])) {
                    countVal--;
                }
            }
        }

        return countVal;
    }
}
