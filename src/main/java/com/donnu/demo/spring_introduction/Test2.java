package com.donnu.demo.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        /*Pet pet =context.getBean("myPet",Pet.class);


        Person person =new Person(pet);
        person.callYourPet();*/
        Person person=context.getBean("myPerson",Person.class);

        person.callYourPet();

        context.close();
    }


}
