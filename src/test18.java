import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),s1 =a/100/10%10*10,s2 = a/100*10%10, s3 = a%10;
        System.out.println(s1+"+"+s2+""+s3);
        System.out.println(a);


    }}
