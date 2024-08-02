package p2588;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int firstNum = sc.nextInt();
        sc.nextLine();
        String second = sc.nextLine();
        char[] secondChar = second.toCharArray();

        int[] secondNum = new int[secondChar.length];

        for (int i = 0; i < secondChar.length; i++) {
            secondNum[i] = Integer.parseInt(String.valueOf(secondChar[i]));
        }

        for (int i = secondNum.length - 1; i >= 0; i--) {
            int result = firstNum * secondNum[i];
            System.out.println(result);
        }
        System.out.println(firstNum * Integer.parseInt(String.valueOf(secondChar)));

    }
}
