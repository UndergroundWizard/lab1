package com.donnu.lab1.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args){

        /*Pet pet=new Dog();
        pet.say();*/

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        /*Pet pet=context.getBean("myPet_Dog",Pet.class);
        pet.say();

        Car car=context.getBean("myCar_Lada",Car.class);
        car.song();*/

        Employee employee=context.getBean("myEmployee1",Employee.class);
        //Employee employee=context.getBean("myEmployee2",Employee.class);

        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        employee.callYourPet();
        employee.showYourCar();

        context.close();
    }
}
