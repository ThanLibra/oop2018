package week2.task1;

public class Task1 {


    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        return (a == b) ? a :
                (a > b) ? gcd(b, a - b) :
                        (b > a) ? gcd(a, b - a) : 0;

    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        return (n == 0) ? 0 :
                (n == 1) ? 1 :
                        (n > 1) ? fibonacci(n - 1) + fibonacci(n - 2) :
                                0;

    }


}

