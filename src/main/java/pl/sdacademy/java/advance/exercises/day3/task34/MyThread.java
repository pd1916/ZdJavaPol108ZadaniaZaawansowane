package pl.sdacademy.java.advance.exercises.day3.task34;

import java.util.Random;

public class MyThread extends Thread{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println("Staring " + name);
            System.out.println("random value: " + new Random().nextInt() + "for " + name);
            System.out.println("Sleeping " + name);
            Thread.sleep(1000);
            System.out.println("Running " + name);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
