import java.util.Random;
import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        if (s1>s2 || s2>s3){
//            System.out.println("ters san ");
//
//        } else if (s1<s2|| s2>s3) {
//            System.out.println("NOL");
//

        Scanner S = new Scanner(System.in);
        int d = S.nextInt();
        int a = S.nextInt();
        if (a<=d){
            d--;
            System.out.println(d-1);
            System.out.println("TERS");
        } else if (a>=d){
            System.out.println(a-3);
            System.out.println("iko");


        }

    }}