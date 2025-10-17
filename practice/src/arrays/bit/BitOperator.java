package arrays.bit;

public class BitOperator {
    public static void operations() {
        int n = 43;
//        AND
        n = n & 1;
//        OR
        n = n | 1;
//        XOR
        n = n ^ 1;
//        NOT
        n = ~n;
//        BIT SHIFTING
        n = 1;
        n = n << 1;
        n = n >> 1;
        return;
    }

    //    Count the number of 1 bit in an int
    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) count += 1;
            n = n >> 1; //same as n / 2
        }
        return count;
    }
}
