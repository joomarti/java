import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();
        int a = myNum/100;
        int b = (myNum/10)%10;
        int c = myNum%10;
        for (int i = 0; i <myNum ; i++) {
        }
        System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));

    }
}
