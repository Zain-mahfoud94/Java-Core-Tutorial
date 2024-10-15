package Conversion;

public class Conversion {
    public static void main(String[] args) {
        //byte b = 127;
        int a = 12;
        // Type casting
        byte k = (byte) a;
        System.err.println(k);
        a = 257;
        // Type casting
        k = (byte) a;
        System.err.println(k);
        float f = 5.6f;
        int t = (int) f;
        System.err.println(t);
        // Type Promotion
        byte b = 10;
        byte c = 30;
        int result = b * c ;
        System.err.println(result);
    }
}
