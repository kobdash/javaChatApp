/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javachatapplication;

/**
 *
 * @author jeff
 */
public class JavaChatApplication {

    public static void main(String[] args) {
        // Start the server in a separate thread
        Thread serverThread = new Thread(() -> {
            server.main(null); // Run the server
        });
        serverThread.start();

        // Start the client
        client.main(null);
    }
}
