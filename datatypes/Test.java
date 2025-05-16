package datatypes;

public class Test {
    public static void main(String[] args) {
        // System.out.println("Ok");

        // int a = 1;
        // byte b = 1;
        // short c = 1;
        // long d = 1;

        // System.out.println(c + d);

        System.out.println("Byte Range: ");
        System.out.println("--------------");
        byte a = 127;
        System.out.println("Example byte value: " + a);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE); // -128 (8 bits)
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE); /// 127
        System.out.println();

        System.out.println("Short Range: ");
        System.out.println("--------------");
        short b = 2;
        System.out.println("Example byte value: " + a);
        System.out.println("Minimum byte value: " + Short.MIN_VALUE); // -128 (8 bits)
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE); /// 127
    }
}
