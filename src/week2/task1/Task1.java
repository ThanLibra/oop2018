package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a,
        a = Math.abs(a);
        b = Math.abs(b);
        return (a == b) ? a : (a == 0) ? b : (b == 0) ? a : (a > b) ? gcd(b, a - b) : gcd(a, b - a);

    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        return (n == 0) ? 0 : (n == 1) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);

    }
}
