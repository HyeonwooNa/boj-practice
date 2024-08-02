package p14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xPos = sc.nextInt();
        sc.nextLine();
        int yPos = sc.nextInt();
        sc.nextLine();

        if(xPos > 0 && yPos > 0){
            System.out.println("1");
        } else if (xPos < 0 && yPos > 0){
            System.out.println("2");
        } else if (xPos < 0 && yPos < 0){
            System.out.println("3");
        } else System.out.println("4");
    }
}
