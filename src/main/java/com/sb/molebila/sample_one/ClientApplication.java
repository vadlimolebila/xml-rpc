package com.sb.molebila.sample_one;

import org.apache.xmlrpc.XmlRpcClient;

import java.net.URL;
import java.util.Vector;

/**
 * @author Nurvadli
 * @created 21/05/2020 - 8꞉05 PM
 */

public class ClientApplication {
    public static void main(String[] args) throws Exception {
        try {
            XmlRpcClient client = new XmlRpcClient("http://localhost/sample");
            Vector params = new Vector();
//
            params.addElement(new Integer(17));
            params.addElement(new Integer(13));

            Object result = client.execute("sample.sum", params);
//            params.addElement("nurvadli");
//            System.out.println(params);
//            Object result = client.execute("sample.insert", params);
            System.out.println(result);
            int sum = ((Integer) result).intValue();
            System.out.println("The sum is: "+ sum);

        } catch (Exception exception) {
            System.err.println("JavaClient: " + exception);
        }
    }
}
