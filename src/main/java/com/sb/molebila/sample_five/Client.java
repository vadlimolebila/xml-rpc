package com.sb.molebila.sample_five;

import org.apache.xmlrpc.XmlRpcClient;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 11꞉08 AM
 */
public class Client {

    private static final String BASE_URL = "http://localhost:8081/RPCclient";

    public static void main(String[] args) {
        try {
            // connect server
            XmlRpcClient server = new XmlRpcClient(BASE_URL);
            Vector params = new Vector();

            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.print("Message to Server : ");
                String pesan = scan.nextLine();
                params.addElement(pesan);
                // send message to server
                Object result = server.execute("myServer.pesanClient", params);
                params.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
