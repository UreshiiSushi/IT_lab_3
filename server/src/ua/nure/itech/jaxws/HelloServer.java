package ua.nure.itech.jaxws;

import javax.xml.ws.Endpoint;

public class HelloServer {
    final static String address = "http://localhost:9090/HelloPort";
    final static Object implementor = new ua.nure.itech.jaxws.service.Hello();

    public static void main(String args[]) throws Exception {
        Endpoint.publish(address, implementor);
        System.out.println("Server ready at " + address + " ...");

        Thread.sleep(15*60*1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
