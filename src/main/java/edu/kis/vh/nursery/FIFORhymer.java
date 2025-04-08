package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    private final defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
    
    @Override
    protected int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
