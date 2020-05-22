package com.sb.molebila.sample_six;

import org.apache.xmlrpc.WebServer;

import java.util.Hashtable;
import java.util.Vector;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 11꞉27 AM
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

    // Method to send Struct to client
    public Hashtable getDataMahasiswa1() {
        Hashtable result = new Hashtable();
        result.put("nim", new Integer(672011061));
        result.put("nama", "Nurvadli");
        result.put("jurusan", "MTI");
        return result;
    }

    // Method to send Multidimensional Struct to client
    public Hashtable getDataMahasiswa2() {
        Hashtable result = new Hashtable();
        result.put("nim", new Integer(672011061));
        result.put("nama", "Nurvadli");
        result.put("jurusan", "Magister Teknik Informatika");
        Hashtable alamatMahasiswa = new Hashtable();
        alamatMahasiswa.put("jalan", "jl. Kledokan 1");
        alamatMahasiswa.put("kota", "Sleman");
        alamatMahasiswa.put("provinsi", "D.I. Yogyakarta");
        result.put("alamat", alamatMahasiswa);

        return result;
    }

    // Method to send Multidimensional Struct with Vector to client
    public Vector getAllDataMahasiswa() {
        Vector result = new Vector();

        Hashtable mahasiswa1 = new Hashtable();
        mahasiswa1.put("nim", new Integer(672011061));
        mahasiswa1.put("nama", "Nurvasdli");
        mahasiswa1.put("jurusan", "MTI");
        result.addElement(mahasiswa1);

        Hashtable mahasiswa2 = new Hashtable();
        mahasiswa2.put("nim", new Integer(682011001));
        mahasiswa2.put("nama", "Berto");
        mahasiswa2.put("jurusan", "MSI");
        result.addElement(mahasiswa2);

        return result;
    }

    // Method to get data (struct) from client
    public void sendDataMahasiswa(Hashtable mahasiswa) {
        int nim = (Integer) mahasiswa.get("nim");
        String nama = (String) mahasiswa.get("nama");
        String jurusan = (String) mahasiswa.get("jurusan");
        System.out.println("Data from client : "+ nim + " - " + nama + " - " + jurusan);
    }
}
