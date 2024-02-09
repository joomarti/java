import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number / 100 % 2 == 0 && number / 10 % 2 == 0 && number % 2 == 0) {
            System.out.println("красивokе число!");
        } else {
            System.out.println("не четно");
    }
}}
