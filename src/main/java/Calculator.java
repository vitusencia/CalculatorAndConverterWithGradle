public class Calculator {

    public double adding(double x, double y) {
        return x + y;
    }

    public double subtracting(double x, double y) {
        return x - y;
    }

    public double multiplying(double x, double y) {
        return x * y;
    }

    public double dividing(double x, double y) {
        if (y != 0) {
            return x / y;
        } else
            return 0;
    }

    public double add(String x, String y) {
        int numX = Integer.parseInt(x);
        int numY = Integer.parseInt(y);
        return numX + numY;
    }

    public double sub(String x, String y) {
        int numX = Integer.parseInt(x);
        int numY = Integer.parseInt(y);
        return numX - numY;
    }

    public double mul(String x, String y) {
        int numX = Integer.parseInt(x);
        int numY = Integer.parseInt(y);
        return numX * numY;
    }

    public double div(String x, String y) {
        int numX = Integer.parseInt(x);
        int numY = Integer.parseInt(y);
        return numX / numY;
    }
}