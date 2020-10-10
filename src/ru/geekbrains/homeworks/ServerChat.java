package ru.geekbrains.homeworks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerChat {
    public static void main(String[] args) {
        new ServerChat();
    }

    public ServerChat(){
        try {
            ServerSocket serverSocket = new ServerSocket(14567);
            Socket clientSocket = serverSocket.accept();

            ExecutorService executorService = Executors.newFixedThreadPool(2);
            ClientChat clientChat = new ClientChat();

            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            Thread t2 = new Thread(() -> {
                try {
                    clientChat.readMessage(in);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            });

            Thread t1 = new Thread(() -> {
                try {
                    clientChat.sendMessage(out);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            });

            executorService.submit(t1);
            executorService.submit(t2);
        }catch (IOException e){
            e.printStackTrace();
        }
        }



}
