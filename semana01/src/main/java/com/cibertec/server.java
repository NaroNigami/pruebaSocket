package com.cibertec;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    private static final int PORT = 13;

    public server() {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("1>> server started on port " + PORT);
            while (true) {
                // new ServerThread(serverSocket.accept()).start();
                System.out.println("2>> wait for client connection");
                Socket clientSocket = serverSocket.accept();

                System.out.println("3>> New Client Connected: " + clientSocket.getInetAddress().getHostAddress());

                System.out.println("4>> client Completed");

                clientSocket.close();

                System.out.println("5>> client disconnected");
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new server();
    }
}
