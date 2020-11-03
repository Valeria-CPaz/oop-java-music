package com.val;

public class TestRunner {

    public void run() {

    RunStringInstruments();
    RunPercussion();

    }

    private void RunPercussion() {
        Drums drums = new Drums();
    }

    private void RunStringInstruments() {

        Guitar g1 = new Guitar("Les Paul", "Strings");
        g1.toString();

    }
}
