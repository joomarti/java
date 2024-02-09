import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = number/10*10,b = number%10;
        System.out.println(a+"+"+b);

    }

    }
