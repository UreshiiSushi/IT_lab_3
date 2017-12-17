package ua.nure.itech.jaxws;

import java.net.MalformedURLException;
import java.net.URL;

import ua.nure.itech.jaxws.service.Hello;
import ua.nure.itech.jaxws.service.HelloService;

public class HelloClient {

    final static String url = "file:///D:/Институт/workspace/IT_lab3_client/HelloService.wsdl";
    public static void main(String args[]) throws MalformedURLException{

        HelloService service = new HelloService(new URL(url));
        Hello client = service.getHelloPort();

        System.out.println(client.hello("User"));

    }

}
