package ru.geekbrains.homeworks;

public class AlphabetPrinter {
    private final Object object = new Object();
    private char letter = 'A';

    public void printA() throws InterruptedException {
        synchronized (object) {
            for (int i = 0; i < 5; i++) {
                while (letter!='A'){
                    object.wait();
                }
                System.out.print(letter);
                letter='B';
                object.notifyAll();
            }
        }
    }
    public void printB() throws InterruptedException {
        synchronized (object) {
            for (int i = 0; i < 5; i++) {
                while (letter!='B'){
                    object.wait();
                }
                System.out.print(letter);
                letter='C';
                object.notifyAll();
            }

        }
    }
    public void printC() throws InterruptedException {
        synchronized (object) {
            for (int i = 0; i < 5; i++) {
                while (letter!='C'){
                    object.wait();
                }
                System.out.print('C');
                letter='A';
                object.notifyAll();
            }
        }
    }

}
