import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = sc.nextInt();
        if(myNum>0){
            System.out.println("pozitive");
        } else if (myNum<0) {
            System.out.println("Negative");
        }else {
            System.out.println("ноль");
        }
    }
}
