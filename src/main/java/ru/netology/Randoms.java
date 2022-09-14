package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int max;
    private final int min;

    protected Random random = new Random();

    public Randoms(int min, int max) {
        this.max = max+1;
        this.min = min;
    }
    protected Integer next() {
        return random.nextInt(min,max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator<Integer>(this);
    }
}
