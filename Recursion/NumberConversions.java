package com.pragya;

public class NumberConversions {

    public static void main(String[] args) {

        System.out.println(decimalToBinary(13));
        System.out.println(decimalToOctal(50));
        System.out.println(decimalToHexaDecimal(64));

    }

    //Convert a Decimal Number into Binary
    public static int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        int result = n % 2 + 10 * decimalToBinary(n / 2);
        return result;
    }

    // Decimal to Octal

    public static int decimalToOctal(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 8 + 10 * decimalToOctal(n / 8);
    }

    // Decimal to Hexadecimal

    public static int decimalToHexaDecimal(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 16 + 10 * decimalToHexaDecimal(n / 16);
    }
}
