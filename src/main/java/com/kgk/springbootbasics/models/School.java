package com.kgk.springbootbasics.models;

import org.springframework.stereotype.Component;

/*
 * Demo of @Component annotation
 * @Component : This annotation is used to load java classes as beans. 
 *              It allows Spring to automatically detect custom beans.
 *              This is used to handle dependency injection.
 * Scope of this component is Singelton. This is spring default scope.
 * Only one object is created by spring.
 */
@Component
public class School {
    private String schName;   

    public School() {
        System.out.println("New School object is created.....");
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String showSchoolDetails(){
        return String.format(" %s", schName);
    }

}
