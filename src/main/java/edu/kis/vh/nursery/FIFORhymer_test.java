package edu.kis.vh.nursery;

public class FIFORhymer_test extends CountingOutRhymer {

    public CountingOutRhymer temp = new CountingOutRhymer();

    @Override
    public int countOut_test() {
        while (!callCheck_test())
            temp.countIn_test(super.countOut_test());

        int ret = temp.countOut_test();

        while (!temp.callCheck_test())
            countIn_test(temp.countOut_test());

        return ret;
    }
}
