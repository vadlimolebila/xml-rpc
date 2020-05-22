package com.sb.molebila.sample_three;

import org.apache.xmlrpc.XmlRpcClient;

import java.util.Vector;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 10꞉27 AM
 */
public class Client1 {

    private final static String BASE_URL = "http://localhost:8081/RPCclient";

    public static void main(String[] args) {
        try {
            //connect to server
            XmlRpcClient server = new XmlRpcClient(BASE_URL);
            Vector params = new Vector();

            //get vector from server
            Object result = server.execute("myServer.getDaftarNama", params);
            Vector daftarNama = (Vector) result;

            for (int i = 0; i < daftarNama.size(); i++) {
                System.out.println(daftarNama.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
