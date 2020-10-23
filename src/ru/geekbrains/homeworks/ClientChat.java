package ru.geekbrains.homeworks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ClientChat {
    private final Object object = new Object();
    void readMessage(DataInputStream in) throws IOException, InterruptedException {
        synchronized (object) {
            String message = in.readUTF();
            while (message.isEmpty()){
                object.wait();
            }
            System.out.println(message);
            object.notifyAll();
        }
    }
    void sendMessage(DataOutputStream out) throws IOException, InterruptedException {
        synchronized (object) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine();
            while (message.isEmpty()){
                object.wait();
            }
            out.writeUTF(message);
            object.notifyAll();
        }
    }

}
