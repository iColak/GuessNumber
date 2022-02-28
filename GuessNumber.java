package Aykut;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int random, number;
        random = (int)(Math.random()*100);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 100 : ");
        number = scanner.nextInt();
        int index = 1;
        while (random != number ) {
            index++;
            if (number < random) {
                System.out.print("Enter a greater number: ");
                number = scanner.nextInt();
            }else if (number > random) {
                System.out.print("Enter a smaller number: ");
                number = scanner.nextInt();
            }
            else break;
        }
        System.out.println("You got the random on the " + index + ". try; Random: " + random + " Number: " + number);
    }
}
