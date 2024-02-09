import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();
        int a = myNum*1;
        int b = myNum%10;
        System.out.println(myNum+"+"+b+"="+(a+b));

    }

    }
