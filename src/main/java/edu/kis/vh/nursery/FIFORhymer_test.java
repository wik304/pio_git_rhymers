package edu.kis.vh.nursery;

public class FIFORhymer_test extends CountingOutRhymer {

    public CountingOutRhymer temp = new CountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
