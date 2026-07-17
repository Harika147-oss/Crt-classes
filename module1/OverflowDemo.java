public class OverflowDemo {
    public static void main(String[] args) {
        byte num = 127;
        System.out.println("Before Overflow = " + num);
        num++;
        System.out.println("After Overflow = " + num);
    }
}