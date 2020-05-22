package com.sb.molebila.sample_five;

import org.apache.xmlrpc.WebServer;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 11꞉09 AM
 */
public class Server {

    public static void main(String[] args) {
        try {
            System.out.println("Start XML-RPC Server...");
            WebServer webServer = new WebServer(8081);
            webServer.addHandler("myServer", new Server());
            webServer.start();

            System.out.println("Started successfully.");
        } catch (Exception exception) {
            System.err.println("Server : " + exception);
        }
    }

    // Method to get Message (String) from client
    public void pesanClient(String pesan) {
        System.out.println(pesan);
    }
}
