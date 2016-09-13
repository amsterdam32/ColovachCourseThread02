package ru.gek.threads;


/**
 * Created by Gazenergo on 08.09.2016.
 */
public class Main {
    public static void main(String[] args){
        SingleElementBuffer buffer = new SingleElementBuffer();
        new Thread(new Producer(1, 1000, buffer)).start();
        System.out.println("");
    }
}
