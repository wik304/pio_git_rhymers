package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int DEFAULT_ERROR = -1;
    private static final int IF_FULL = 11;
    private static final int PEEKA_BOO_EMPTY_DEAFAULT_ERROR = -1;
    private static final int COUNT_OUT_DEFAULT_ERROR = -1;
    private final int[] numbers = new int[MAX_SIZE];

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == DEFAULT_ERROR;
    }

    protected boolean isFull() {
        return total == IF_FULL;
    }
        
    protected int peekaboo() {
        if (callCheck())
            return PEEKA_BOO_EMPTY_DEAFAULT_ERROR;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return COUNT_OUT_DEFAULT_ERROR;
        return numbers[total--];
    }

}
