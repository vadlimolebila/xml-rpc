package com.sb.molebila.sample_three;

import org.apache.xmlrpc.WebServer;

import java.util.Vector;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 10꞉41 AM
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

    // Method to send Vector to client
    public Vector getDaftarNama() {
        Vector daftarNama = new Vector();
        daftarNama.addElement("Nurvadli");
        daftarNama.addElement("Agus");
        daftarNama.addElement("Berto");

        return daftarNama;
    }

    // Method to send Multidimensional Vector to client
    public Vector getAllDataMahasiswa(){
        Vector result = new Vector();

        Vector mahasiswa1=new Vector();
        mahasiswa1.addElement("672011061");
        mahasiswa1.addElement("Agus");
        mahasiswa1.addElement("TI");
        result.addElement(mahasiswa1);

        Vector mahasiswa2=new Vector();
        mahasiswa2.addElement("682011001");
        mahasiswa2.addElement("Berto");
        mahasiswa2.addElement("SI");
        result.addElement(mahasiswa2);

        return result;
    }
}
