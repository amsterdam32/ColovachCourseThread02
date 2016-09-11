package ru.gek.threads;

/**
 * Created by Gazenergo on 09.09.2016.
 */
public class SingleElementBuffer {
    private Integer elem = null;

    public synchronized void put(int newElement) throws InterruptedException {}

    public synchronized  int get() throws InterruptedException {}

}
