import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();
        int a = myNum/100;
        int b =myNum/10%10;
        int c = myNum%10;
        int s1 = c*100+b*10+a;
        System.out.println("нов значнеие: "+s1);
        int s2 = s1-20;
        System.out.println("результат"+s2);

    }

    }
