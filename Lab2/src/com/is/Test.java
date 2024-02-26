package com.is;

// Clasa Test
class Test {
    private int rng;

    // Constructorul care inițializează variabila rng
    public Test(int rng) {
        this.rng = rng;
    }

    // Funcția care returnează valoarea rng%x
    public int getRng(int x) {
        return rng % x;
    }
}