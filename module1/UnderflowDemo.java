public class UnderflowDemo {
    public static void main(String[] args) {
        byte num = -128;
        System.out.println("Before Underflow = " + num);
        num--;
        System.out.println("After Underflow = " + num);
    }
}