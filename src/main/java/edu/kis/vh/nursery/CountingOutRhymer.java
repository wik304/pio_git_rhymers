package edu.kis.vh.nursery;

public class CountingOutRhymer {

    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void countIn_test(int in) {
        if (!isFull_test())
            NUMBERS[++total] = in;
    }

    public boolean callCheck_test() {
        return total == -1;
    }

    public boolean isFull_test() {
        return total == 11;
    }

    protected int peekaboo_test() {
        if (callCheck_test())
            return -1;
        return NUMBERS[total];
    }

    public int countOut_test() {
        if (callCheck_test())
            return -1;
        return NUMBERS[total--];
    }

}
