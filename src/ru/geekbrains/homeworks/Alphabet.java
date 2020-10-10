package ru.geekbrains.homeworks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Alphabet {

    public static void main(String[] args) {
        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Thread t1 = new Thread(() -> {
            try {
                alphabetPrinter.printA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                alphabetPrinter.printB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                alphabetPrinter.printC();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
    }


}
