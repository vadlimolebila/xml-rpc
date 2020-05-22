package com.sb.molebila.sample_six;

import org.apache.xmlrpc.XmlRpcClient;

import java.util.Hashtable;
import java.util.Vector;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 11꞉13 AM
 */
public class Client2 {

    private static final String  BASE_URL ="http://localhost:8081/RPCclient";

    public static void main(String[] args) {
        try {
            // connect server
            XmlRpcClient server = new XmlRpcClient(BASE_URL);
            Vector params = new Vector();

            // get data from server
            Object result = server.execute("myServer.getDataMahasiswa2", params);
            Hashtable mahasiswa = (Hashtable) result;
            int nim = (Integer) mahasiswa.get("nim");
            String nama = (String) mahasiswa.get("nama");
            String jurusan = (String) mahasiswa.get("jurusan");
            // alamat
            Hashtable alamatMahasiswa=(Hashtable) mahasiswa.get("alamat");
            String jalan = (String) alamatMahasiswa.get("jalan");
            String kota = (String) alamatMahasiswa.get("kota");
            String provinsi = (String) alamatMahasiswa.get("provinsi");
            System.out.println(nim + " - "+ nama + " - "+ jurusan);
            System.out.println("Alamat : " + jalan + ", "+ kota + ", "+ provinsi);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
