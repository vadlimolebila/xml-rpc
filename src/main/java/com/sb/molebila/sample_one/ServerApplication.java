package com.sb.molebila.sample_one;

import org.apache.xmlrpc.WebServer;

/**
 * @author Nurvadli
 * @created 21/05/2020 - 8꞉13 PM
 */
public class ServerApplication {
    public Integer sum(int x, int y){
        return new Integer(x+y);
    }

    public static void main (String [] args){

        try {

            System.out.println("Attempting to start XML-RPC Server...");

            WebServer server = new WebServer(80);
            server.addHandler("sample", new ServerApplication());
            server.start();

            System.out.println("Started successfully.");
            System.out.println("Accepting requests. (Halt program to stop.)");

        } catch (Exception exception){
            System.err.println("JavaServer: " + exception);
        }
    }

    public void insert(String nama){
        System.out.println(nama +" Your data has been created Successfull.");
    }
}
