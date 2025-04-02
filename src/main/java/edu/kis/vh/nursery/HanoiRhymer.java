package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    private int totalRejected = 0;

    protected int reportRejected() {
        return totalRejected;
    }
    @Override
    protected void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
