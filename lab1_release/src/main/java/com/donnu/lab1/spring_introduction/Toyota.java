package com.donnu.lab1.spring_introduction;

public class Toyota implements  Car{
    @Override
    public void song()
    {
        System.out.println("Врум-врум-врум!");
    }
    @Override
    public void model()
    {
        System.out.println("Toyota Corolla");
    }
}
