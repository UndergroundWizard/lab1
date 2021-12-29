package com.donnu.lab1.spring_introduction;

public class Cat implements Pet{
    @Override
    public void say(){
        System.out.println("Мяу, есть давай!");
    }
}
