import java.util.Random;
import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
       int a = sk.nextInt();
       int a1 = sk.nextInt();
        for (int i = 0; i < 200; i++) {
            if (a<=200){
                System.out.println(a-=a1);
            } else if (a>=200) {
                System.out.println(a+=a1);



            }

        }

    }}
