package p5597;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        int[] students = new int[30];

        for (int i = 0; i < students.length ; i++) {
            students[i] = i + 1;
        }

        for (int i = 0; i < students.length - 2; i++) {
            input = br.readLine();
            for (int j = 0; j < students.length; j++) {
                if (students[j] == Integer.parseInt(input)){
                    students[j] = 0;
                }
            }
        }

        for (int i = 0; i < students.length ; i++) {
            if (students[i] != 0){
                bw.write(students[i] + " ");
            }
        }
        br.close();
        bw.close();
    }
}