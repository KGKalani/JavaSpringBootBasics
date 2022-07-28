package com.kgk.springbootbasics;

import org.springframework.context.ConfigurableApplicationContext;

import com.kgk.springbootbasics.models.Address;
import com.kgk.springbootbasics.models.School;
import com.kgk.springbootbasics.models.Student;

public class DependencyInjectionDemo {
    
    public static void demo(ConfigurableApplicationContext context){

        /*Since School Component's Scope is singelton, Spring Container has only one school object.
         * Instance of School is created at Spring container is initialized. ()
         */
        School school = context.getBean(School.class);
        school.setSchName("Cambridge College");

        /*Since Student Component's Scope is prototype, Spring creates student object when getBean is called.
         * Because of that Spring Container contains one or more Student objects
         * Address Component is same as Student Component.
         * Since Address Component is autowired in Student Component, When Student object is created, Address object is also created.
         */
        Student stdOne = context.getBean(Student.class);
        stdOne.setsId(1);
		stdOne.setsName("Jhon");

        Address stdOneAddress = stdOne.getsAddress();        
		stdOneAddress.setNo("No. 02");
		stdOneAddress.setRd("Lake Rd");
		stdOneAddress.setCity("Melborn");		

		stdOne.showStudentDetails();

        System.out.println();
        /*
         * Here Spring creates new Student object and Address object
         */
		Student stdTwo = context.getBean(Student.class);
        stdTwo.setsId(2);
		stdTwo.setsName("Bob");
		stdTwo.showStudentDetails();

    }
}
