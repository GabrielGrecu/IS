package com.is;

class Test {
    private int rng;

    public Test(int rng) {
        this.rng = rng;
    }

    public int getRng(int x) {
        return rng % x;
    }
}