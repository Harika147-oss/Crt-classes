import java.util.Scanner;
public class Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double circumference = 2 * Math.PI * r;
        System.out.println("Circumference = " + circumference);
    }
}