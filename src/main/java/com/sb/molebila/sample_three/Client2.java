package com.sb.molebila.sample_three;

import com.sun.xml.internal.ws.util.QNameMap;
import org.apache.xmlrpc.XmlRpcClient;

import java.util.Vector;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 10꞉32 AM
 */
public class Client2 {

    private static final String BASE_URL = "http://localhost:8081/RPCclient";

    public static void main(String[] args) {
        try {
            //connect to server
            XmlRpcClient server = new XmlRpcClient(BASE_URL);
            Vector params = new Vector();

            // get vector from server
            Object result = server.execute("myServer.getAllDataMahasiswa", params);
            Vector daftarMahasiswa = (Vector) result;

            for (int i = 0; i < daftarMahasiswa.size(); i++) {
                Vector mahasiswa = (Vector) daftarMahasiswa.get(i);
                String nim = (String) mahasiswa.get(0);
                String nama = (String) mahasiswa.get(1);
                String jurusan = (String) mahasiswa.get(2);

                System.out.println(nim + " - " + nama + " - " + jurusan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
