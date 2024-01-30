public class Converter {
    public String decimalToBinary(String value) {
        return Integer.toBinaryString(Integer.parseInt(value));
    }

    public int binaryToDecimal(String value) {
        return Integer.parseInt(value, 2);
    }

    public String decimalToOctal(String value) {
        return Integer.toOctalString(Integer.parseInt(value));
    }

    public int octalToDecimal(String value) {
        return Integer.parseInt(value, 8);
    }

    public String decimalToHex(String value) {
        return Integer.toHexString(Integer.parseInt(value));
    }

    public int hexToDecimal(String value) {
        return Integer.parseInt(value, 16);
    }
}