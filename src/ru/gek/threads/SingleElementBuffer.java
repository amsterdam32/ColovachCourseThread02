package ru.gek.threads;

/**
 * Created by Gazenergo on 09.09.2016.
 */
public class SingleElementBuffer {
    private Integer elem = null;

    public synchronized void put(Integer newElem) throws InterruptedException {
        while (elem != null) {
            this.wait();
            if (elem != null) {
                this.notify();
            }
        }
        this.elem = newElem;
        this.notify();
    }

    public synchronized Integer get() throws InterruptedException {
        while (elem == null) {
            this.wait();
            if (elem == null) {
                this.notify();
            }
        }
        int result = this.elem;
        this.elem = null;
        this.notify();
        return result;
    }

}
