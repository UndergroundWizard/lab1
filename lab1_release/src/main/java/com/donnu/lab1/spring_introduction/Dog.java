package com.donnu.lab1.spring_introduction;

public class Dog implements Pet{
    @Override
    public void say(){
        System.out.println("Гав, пошли гулять!");
    }
}
