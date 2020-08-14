/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author saotr
 */
@WebService(serviceName = "Calculator")
public class Calculator {


    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod
    public float plus(float x,float y){
        return x+y;
    }
    
    @WebMethod 
    public float minus(float x,float y){
        return x-y;
    }
    
    @WebMethod
    public float devide(float x,float y){
        if(y==0){
            throw new ArithmeticException();
        }
        return x/y; 
    }
    @WebMethod
    public float multiple(float x,float y){
        return x*y;
    }
}
