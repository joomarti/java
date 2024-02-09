import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),s1 =a/100*100,s2 = a/10%10*10,s3 = a%10;
        System.out.println(s1+"+"+s2+"+"+s3);

    }

    }
