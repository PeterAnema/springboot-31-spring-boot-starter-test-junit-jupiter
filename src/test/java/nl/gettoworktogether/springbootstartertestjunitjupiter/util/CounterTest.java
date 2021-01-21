package nl.gettoworktogether.springbootstartertestjunitjupiter.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void simpelTest() {
        String s = "abcdefg";
        String upper = s.toUpperCase();
        assertEquals("ABCDEFG", upper);
    }

    @Test
    void simpelTest2() {
        String s = "ABCDEFG";
        String actual = s.toLowerCase();
        assertEquals("abcdefg", actual);
    }

    @Test
    void addWithLoopTest() {
        int[] getallen = new int[] {1,2,3};
        int actual = Counter.addWithLoop(getallen);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void addWithStreamTest() {
        int[] getallen = new int[] {1,2,3};
        int actual = Counter.addWithStream(getallen);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void getSmallestNumberTest() {
        int[] getallen = new int[] {1,2,3};
        int actual = Counter.getSmallestNumber(getallen);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void getSmallestNumberWithEmptyArrayTest() {
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
            int[] numbers = new int[] {};
            int actual = Counter.getSmallestNumber(numbers);
        });
    }

    @Test
    void testTellerInstantiate() {
        Counter counter = new Counter();
        assertNotNull(counter);
        assertEquals(0, counter.getTotal());
    }

    @Test
    void testTellerAdd() {
        // given
        Counter counter = new Counter();

        counter.add(45);
        counter.add(67);
        counter.add(32);

        // when
        int actual = counter.getTotal();

        // then
        int expected = 144;
        assertEquals(expected, actual);
    }

}