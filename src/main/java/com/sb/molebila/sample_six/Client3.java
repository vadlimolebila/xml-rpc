package com.sb.molebila.sample_six;

import org.apache.xmlrpc.XmlRpcClient;

import java.util.Hashtable;
import java.util.Vector;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 11꞉24 AM
 */
public class Client3 {

    private static final String BASE_URL = "http://localhost:8081/RPCclient";

    public static void main(String[] args) {
        try {
            // connect server
            XmlRpcClient server = new XmlRpcClient(BASE_URL);
            Vector params = new Vector();

            Object result = server.execute("myServer.getAllDataMahasiswa", params);
            Vector daftarMahasiswa = (Vector) result;
            for (int i = 0; i < daftarMahasiswa.size(); i++) {
                Hashtable mahasiswa = (Hashtable) daftarMahasiswa.get(i);
                int nim = (Integer) mahasiswa.get("nim");
                String nama = (String) mahasiswa.get("nama");
                String jurusan = (String) mahasiswa.get("jurusan");
                System.out.println(nim + " - "+ nama + " - "+ jurusan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
