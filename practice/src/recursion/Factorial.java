package recursion;

public class Factorial {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * (n - 1);
    }
}

//one branch recursion O(n)
