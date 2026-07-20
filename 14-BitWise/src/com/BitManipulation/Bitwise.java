package com.BitManipulation;

public class Bitwise {
    static void main(String[] args) {

        /*
            Number System:
            1. Decimal (Base 10)
            {0,1,2,3,4,5,6,7,8,9}

            2. Binary  (Base 2)
            {0,1}

            3. Octal   (Base 8)
            {0,1,2,3,4,5,6,7}

            4. HexaDecimal (Base 16)
            {0,1,2,3,4,5,6,7,8,9,A,B.C,D,E,F}

         */




        //types of bitiwse operators
        // &   ==> AND
        // |   ==> OR
        // ^   ==> XOR
        // ~   ==> NOT
        // <<  ==> Left Shift
        // >>  ==> Right Shift
        // >>> ==> Unsigned Right Shift


        /*
            Bitwise &
            =========

            1 & 1 = 1
            1 & 0 = 0
            0 & 1 = 0
            0 & 0 = 0

         */
        System.out.println("Bitwise AND");
        System.out.println(1 & 1);
        System.out.println(1 & 0);
        System.out.println(0 & 1);
        System.out.println(0 & 0);

        /*

            Bitwise |
            =========

            1 | 1 = 1
            1 | 0 = 0
            0 | 1 = 0
            0 | 0 = 0

         */

        System.out.println();
        System.out.println("Bitwise OR");
        System.out.println(0 | 1);
        System.out.println(1 | 0);
        System.out.println(1 | 1);
        System.out.println(0 | 0);

        /*

            Bitwise ^
            =========

            1 ^ 1 = 0
            1 ^ 0 = 1
            0 ^ 1 = 1
            0 ^ 0 = 0

         */

        System.out.println();
        System.out.println("Bitwise XOR");
        System.out.println(1 ^ 1);
        System.out.println(1 ^ 0);
        System.out.println(0 ^ 1);
        System.out.println(0 ^ 0);
        System.out.println();

        // Left shift <<  formula: a << b = a*2^b
        int n = 5;
        for (int i = 0; i <= 30; i++) {
            n = n << 1;
            System.out.println(n);
            System.out.println();
        }

        // Right shift >> formula: a >> b = a/2^b
        int m = 100;
        for (int i = 0; i <= 10; i++) {
            m = m >> 1;
            System.out.println();
            System.out.println(m);
        }
    }
}
