package p25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long totalAmount = Long.parseLong(br.readLine());
        int num = Integer.parseInt(br.readLine());
        long sum = 0;

        for (int i = 0; i < num; i++) {
            String[] products = br.readLine().split(" ");
            sum += (Long.parseLong(products[0]) * Long.parseLong(products[1]));
        }

        if(sum == totalAmount) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
