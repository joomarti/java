import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input>0){
            System.out.println("Output: "+input*2);
        } else if (input<0) {
            System.out.println("Output: "+input);
        }

    }
}
