/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import animal.Dog;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


//http://localhost:8080/WebApplication1/NewWebService
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod
    public Dog find(){
        return new Dog("Abc","Mean");
    }
    @WebMethod
    public List<Dog> findAll(){
        List<Dog> list = new  ArrayList<>();
        list.add(new Dog("Milu","Xuc Xich"));
        list.add(new Dog("Milu2","Xuc Xich"));
        return list;
    }
}
