package p2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time = br.readLine().split(" ");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int alertMin = minute - 45;

        if (alertMin < 0){
            hour -= 1;
            minute += 15;
            if (hour < 0){
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        } else{
            System.out.println(hour + " " + alertMin);
        }
    }
}
