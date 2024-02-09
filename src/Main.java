import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int myNum = scanner.nextInt();
        int a = myNum/100;
        int b = (myNum/10)%10;
        int c = myNum%10;
        System.out .println(c+" "+b+" "+a);







    }
}