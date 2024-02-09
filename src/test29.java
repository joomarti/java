import java.util.Random;
import java.util.Scanner;

public class test29 {
public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int a = scanner.nextInt();
    int s = random.nextInt(1,100);
    if (a<s){
        System.out.println(a +"BARABAR EMES "+s);
        random.nextInt(1,100);
        scanner.nextInt(s);

    } else if (s==a) {
        System.out.println("barabar emes ");
        random.nextInt(1,100);
        scanner.nextInt(s);
    } else if (a==s) {
        System.out.println("barabar ");
        for (a = 0; s==a; a++ );
        System.out.println("barabar");

    }
}}