import java.util.Scanner;

public class LogicalOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 18 || age > 60) {
            System.out.println("Special Category");
        } else {
            System.out.println("Normal Category");
        }

        sc.close();
    }
}