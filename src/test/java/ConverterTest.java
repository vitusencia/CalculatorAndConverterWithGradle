import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void decimalToBinary() {
        Converter converter = new Converter();
        assertEquals("101", converter.decimalToBinary("5"));
    }

    @Test
    void binaryToDecimal() {
        Converter converter = new Converter();
        assertEquals(5, converter.binaryToDecimal("101"));
    }

    @Test
    void decimalToOctal() {
        Converter converter = new Converter();
        assertEquals("5", converter.decimalToOctal("5"));
    }

    @Test
    void octalToDecimal() {
        Converter converter = new Converter();
        assertEquals(5, converter.octalToDecimal("5"));
    }

    @Test
    void decimalToHex() {
        Converter converter = new Converter();
        assertEquals("5", converter.decimalToHex("5"));
    }

    @Test
    void hexToDecimal() {
        Converter converter = new Converter();
        assertEquals(5, converter.hexToDecimal("5"));
    }
}
