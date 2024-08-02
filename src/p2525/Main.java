package p2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] currentTime = br.readLine().split(" ");
        long cookingMinute = Long.parseLong(br.readLine());
        br.close();

        long currentHour = Long.parseLong(currentTime[0]);
        long currentMinute = Long.parseLong(currentTime[1]);

        long addHour = cookingMinute / 60;
        long addMinute = cookingMinute % 60;

        if ((currentMinute + cookingMinute) > 59) {
            currentHour += addHour;
            currentMinute += addMinute;
            if (currentMinute > 59){
                addHour = currentMinute / 60;
                addMinute = currentMinute % 60;
                currentHour += addHour;
                currentMinute = addMinute;
            }
        } else {
            currentMinute += cookingMinute;
        }

        if (currentHour > 23) {
            currentHour -= 24;
        }

        System.out.println(currentHour + " " + currentMinute);
    }
}
