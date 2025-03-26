package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int DEFAULT_ERROR = -1;
    public static final int IF_FULL = 11;
    public static final int PEEKA_BOO_EMPTY_DEAFAULT_ERROR = -1;
    public static final int COUNT_OUT_DEFAULT_ERROR = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_ERROR;
    }
        
    public boolean isFull() {
        return total == IF_FULL;
    }
        
    protected int peekaboo() {
        if (callCheck())
            return PEEKA_BOO_EMPTY_DEAFAULT_ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return COUNT_OUT_DEFAULT_ERROR;
        return numbers[total--];
    }

}
