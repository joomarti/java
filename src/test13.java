import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner     scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result1 = input/10;
        int result2 = input%10;
        int mult = result1*result2;
        if(input>mult){
            System.out.println(input+">"+mult);

    }
}}
