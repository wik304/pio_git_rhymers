package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        CountingOutRhymer rhymer = new CountingOutRhymer();
        int testValue = 4;
        rhymer.countIn_test(testValue);

        int result = rhymer.peekaboo_test();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        CountingOutRhymer rhymer = new CountingOutRhymer();
        boolean result = rhymer.callCheck_test();
        Assert.assertEquals(true, result);

        rhymer.countIn_test(888);

        result = rhymer.callCheck_test();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        CountingOutRhymer rhymer = new CountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull_test();
            Assert.assertEquals(false, result);
            rhymer.countIn_test(888);
        }

        boolean result = rhymer.isFull_test();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        CountingOutRhymer rhymer = new CountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo_test();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn_test(testValue);

        result = rhymer.peekaboo_test();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo_test();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        CountingOutRhymer rhymer = new CountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut_test();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn_test(testValue);

        result = rhymer.countOut_test();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut_test();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
