package ru.gek.threads;

/**
 * Created by Gazenergo on 09.09.2016.
 */
public class Consumer implements Runnable {
    private final SingleElementBuffer buffer;

    public Consumer(SingleElementBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        while (true) {
            Integer elem = buffer.get();
            System.out.println(elem + " consumed");

        }
    }
}
