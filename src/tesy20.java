import java.util.Scanner;

public class tesy20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        for (int i = 0; i<4; i++ ){
            System.out.println(a*i*10%10%10%10);

        }
        System.out.println("bar: 1");
        System.out.println("bar: 2");
        System.out.println("bar: 3");
        System.out.println("bar: 4");
    }

    }
