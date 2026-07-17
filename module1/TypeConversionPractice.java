public class TypeConversionPractice {
    public static void main(String[] args) {
        // int to double (Implicit Casting)
        int num = 100;
        double d = num;
        // double to int (Explicit Casting)
        double value = 45.75;
        int i = (int) value;
        // char to int (ASCII)
        char ch = 'A';
        int ascii = ch;
        // int to char (ASCII to Character)
        int code = 66;
        char letter = (char) code;
        System.out.println("Integer to Double : " + d);
        System.out.println("Double to Integer : " + i);
        System.out.println("Character to ASCII : " + ascii);
        System.out.println("ASCII to Character : " + letter);
    }
}