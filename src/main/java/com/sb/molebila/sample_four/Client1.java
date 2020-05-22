package com.sb.molebila.sample_four;

import org.apache.xmlrpc.XmlRpcClient;

import java.io.FileOutputStream;
import java.util.Vector;

/**
 * @author Nurvadli
 * @created 22/05/2020 - 10꞉56 AM
 */
public class Client1 {

    private static final String BASE_URL = "http://localhost:8081/RPCclient";

    public static void main(String[] args) {
        try {
            // connect server
            XmlRpcClient server = new XmlRpcClient(BASE_URL);
            Vector params = new Vector();

            // get Byte from server
            Object result = server.execute("myServer.getFile", params);
            byte[] myByteArray = (byte[]) result;
            // Convert Byte to File
            String projectPath = System.getProperty("user.dir");
            String imagePath = projectPath + "/gambarClient/gambar1.jpg";
            FileOutputStream fileOutputStream = new FileOutputStream(imagePath);
            fileOutputStream.write(myByteArray);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
