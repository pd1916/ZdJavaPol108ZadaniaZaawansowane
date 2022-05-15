package pl.sdacademy.java.advance.exercises.day3.task35;

import java.util.Random;

public class MyRunnable implements Runnable{
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //String name = Thread.currentThread().getName();
        System.out.printf("%s - Rozpoczynam pracę \n", name);
        System.out.println();
        while(!Thread.interrupted()) {
            System.out.printf("%s - Pracuję \n", name);
            System.out.printf("%s - Idę spać \n", name);
//            try {
//                //Thread.sleep(1000 + new Random().nextInt(5000));
//                Thread.sleep(5000);
//            } catch(InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.printf("%s - Wstałem i pracuję \n", name);
            System.out.println();
        }
        System.out.printf("%s - Kończę pracę \n", name);
    }
}
