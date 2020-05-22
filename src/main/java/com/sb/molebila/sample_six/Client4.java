package com.sb.molebila.sample_six;

import org.apache.xmlrpc.XmlRpcClient;

import java.util.Hashtable;
import java.util.Vector;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 11꞉25 AM
 */
public class Client4 {

    private static final String BASE_URL = "http://localhost:8081/RPCclient";

    public static void main(String[] args) {

        try {
            // connect server
            XmlRpcClient server = new XmlRpcClient(BASE_URL);
            Vector params = new Vector();

            // create struct
            Hashtable mahasiswa = new Hashtable();
            mahasiswa.put("nim", new Integer(672011061));
            mahasiswa.put("nama", "Marsel");
            mahasiswa.put("jurusan", "TI");
            params.addElement(mahasiswa);
            // send struct to server
            Object result = server.execute("myServer.sendDataMahasiswa", params);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
