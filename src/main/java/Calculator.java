public class Calculator {

    public static double adding(double x, double y) {
        return x + y;
    }

    public static double subtracting(double x, double y) {
        return x - y;
    }

    public static double multiplying(double x, double y) {
        return x * y;
    }

    public static double dividing(double x, double y) {
        if (y != 0) {
            return x / y;
        } else
            return 0;
    }

    public static double add(String x, String y) {
        int numX = Integer.parseInt(x);
        int numY = Integer.parseInt(y);
        return numX + numY;
    }

    public static double sub(String x, String y) {
        int numX = Integer.parseInt(x);
        int numY = Integer.parseInt(y);
        return numX - numY;
    }

    public static double mul(String x, String y) {
        int numX = Integer.parseInt(x);
        int numY = Integer.parseInt(y);
        return numX * numY;
    }

    public static double div(String x, String y) {
        int numX = Integer.parseInt(x);
        int numY = Integer.parseInt(y);
        return numX / numY;
    }
}