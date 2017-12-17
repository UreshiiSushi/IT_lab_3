package ua.nure.itech.jaxws.service;

import javax.jws.WebService;

@WebService
public class Hello {

    public String hello(String name){
        return "Hello, " + name + "!";
    }
}
