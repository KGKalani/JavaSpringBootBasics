package com.kgk.springbootbasics.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Demo of @Component annotation
 * @Component : This annotation is used to load java classes as beans. 
 *              It allows Spring to automatically detect custom beans.
 *              This is used to handle dependency injection.
 * Scope of this component is prototype. 
 * New object is created by spring when it is required.
 */
@Component
@Scope("prototype")
public class Address {
    private String no;
    private String rd;
    private String city;    

    public Address() {
        System.out.println("New Address object is created.....");
    }

    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getRd() {
        return rd;
    }
    public void setRd(String rd) {
        this.rd = rd;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public String showAddress(){
       return String.format("%s, %s, %s",no, rd, city);
    }

    
    
}
