package kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHello {

    private RomanNumerals romannumerals;

    @Before
    public void setUp() throws Exception {
        romannumerals = new RomanNumerals();
    }

    @Test
    public void shouldReturnIWhenGiven1() {
        assertEquals("I", romannumerals.convert(1));
    }

    @Test
    public void shouldReturnVWhenGiven5() {
        assertEquals("V", romannumerals.convert(5));
    }

    @Test
    public void shouldReturnXWhenGiven10() {
        assertEquals("X", romannumerals.convert(10));
    }

    @Test
    public void shouldReturnIIWhenGiven2() {
        assertEquals("II", romannumerals.convert(2));
    }

    @Test
    public void shouldReturnIVWhenGiven4() {
        assertEquals("IV", romannumerals.convert(4));
    }

    @Test
    public void shouldReturnVIWhenGiven6() {
        assertEquals("VI", romannumerals.convert(6));
    }

    @Test
    public void shouldReturnXIWhenGiven11() {
        assertEquals("XI", romannumerals.convert(11));
    }

    @Test
    public void shouldReturnXXIWhenGiven21() {
        assertEquals("XXI", romannumerals.convert(21));
    }

    @Test
    public void shouldReturnXXVIIIWhenGiven28() {
        assertEquals("XXVIII", romannumerals.convert(28));
    }

    @Test
    public void shouldREturnMXXIIIWhenGIven123() {
        assertEquals("CXXIII", romannumerals.convert(123));
    }

    @Test
    public void shouldReturnXCIWhenGIven91() {
        assertEquals("XCI", romannumerals.convert(91));
    }

    @Test
    public void shouldReturnXCIXWhenGiven99() {
        assertEquals("XCIX", romannumerals.convert(99));
    }
}
