package ru.netology;

import java.util.Iterator;

public class RandomIterator<Integer> implements Iterator {

    Randoms randoms;

    public RandomIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {
        return randoms.next();
    }
}
