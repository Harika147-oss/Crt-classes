import java.util.Scanner;

public class UnsignedRightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();

        int result = number >>> shift;

        System.out.println("Unsigned Right Shift Result = " + result);

        sc.close();
    }
}