package com.kgk.springbootbasics.models;

import org.springframework.beans.factory.annotation.Autowired;
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
public class Student {
    private int sId;
    private String sName;

    public Student() {
        System.out.println("New Student object is created.....");
    }

    @Autowired
    private Address sAddress;

    @Autowired
    private School sSchool;
      
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Address getsAddress() {
        return sAddress;
    }

    public void setsAddress(Address sAddress) {
        this.sAddress = sAddress;
    }
    
    public School getsSchool() {
        return sSchool;
    }

    public void setsSchool(School sSchool) {
        this.sSchool = sSchool;
    }

    public void showStudentDetails(){
        System.out.println("Student name : " + sName);
        System.out.println("Student address : " + sAddress.showAddress());
        System.out.println("Student school : " + sSchool.showSchoolDetails());
    }

}
