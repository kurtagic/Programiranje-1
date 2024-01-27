public class Fibonacci {
    private int a;
    private int b;

    public Fibonacci(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int naslednji() {
        int sum = a + b;
        a = b;
        b = sum;
        return sum;
    }
}