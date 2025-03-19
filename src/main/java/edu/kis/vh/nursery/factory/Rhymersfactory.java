package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOutRhymer;

public interface Rhymersfactory {

    public CountingOutRhymer GetStandardRhymer();

    public CountingOutRhymer GetFalseRhymer();

    public CountingOutRhymer GetFIFORhymer();

    public CountingOutRhymer GetHanoiRhymer();

}
