public class ReturnResult {
    public static int addition(int x, int y) {
        return x + y;

    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int l, int m) {
        return l * m;
    }

    public static double division(double c, double d) {
        double result = Double.parseDouble(String.format("%.2f",(c/d)));
        return result;
    }

    public static int modulus(int e, int f) {
        return e % f;
    }
}


