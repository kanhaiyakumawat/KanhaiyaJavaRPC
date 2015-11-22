package com.kanhaiyakumawat.kanhaiyajavarpc;
import org.apache.xmlrpc.server.*;
import org.apache.xmlrpc.webserver.*;

public class RPCServer {
	public static void main(String[] args) {
		try{
			// Create a web server end-point
			// This is local host port:8080
			WebServer webServer = new WebServer(8080);
	        
			// Get the instance of the RPC server 
	        XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();
	        
	        // All the classes you will be using over RPC here
	        PropertyHandlerMapping phm = new PropertyHandlerMapping();
	        phm.addHandler("MathComputation", MathComputation.class);

	        // This sets up XML-RPC server to have access to all
	        // the needed methods
	        xmlRpcServer.setHandlerMapping(phm);
	      
	        // These are server properties, enable them as you need.
	        XmlRpcServerConfigImpl serverConfig =
	            (XmlRpcServerConfigImpl) xmlRpcServer.getConfig();
	        serverConfig.setEnabledForExtensions(true);
	        serverConfig.setContentLengthOptional(false);

	        // Start the server and you are ready
	        webServer.start();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace(System.out);
		}
	}

}
