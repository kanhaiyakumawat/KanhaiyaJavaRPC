package com.kanhaiyakumawat.kanhaiyajavarpc;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.util.ClientFactory;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

public class RPCClient {
	public static void main(String args[]) {
		try {
			String function = "MathComputation.ComputePi";
			XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
			config.setServerURL(new URL("http://127.0.0.1:8080/xmlrpc"));
			XmlRpcClient client = new XmlRpcClient();
			client.setConfig(config);
			Vector param = new Vector(1);
			param.add(0);
			
			double result = (double) client.execute(function,param);
			System.out.println("Result is: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
