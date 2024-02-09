import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int s1 = num / 10;
        int s2 = num % 10;
        int numder = s2*10+s1;
        int result = numder + 8;
        System.out.println( "жаны мани"+numder );
        System.out.println("" + result);

    }


    }
