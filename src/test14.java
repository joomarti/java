import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("окуучулардын саны: ");
        int students = sc.nextInt();
        System.out.print("отургучтардын саны: ");
        int armchair = sc.nextInt();
        if(students>armchair){
            int a =students-armchair;
            System.out.println(a+" окуучу ашып калды");
        }else if (students < armchair){
            System.out.println(armchair-students+" парта жетпей калды");
        }else{
            System.out.println("баарына  жайгашты");
        }
    }
}
