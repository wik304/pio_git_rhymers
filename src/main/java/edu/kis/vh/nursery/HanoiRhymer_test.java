package edu.kis.vh.nursery;

public class HanoiRhymer_test extends CountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected_test() {
        return totalRejected;
    }

    public void countIn_test(int in) {
        if (!callCheck_test() && in > peekaboo_test())
            totalRejected++;
        else
            super.countIn_test(in);
    }
}
