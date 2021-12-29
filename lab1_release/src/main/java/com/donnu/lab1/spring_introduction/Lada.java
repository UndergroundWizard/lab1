package com.donnu.lab1.spring_introduction;

public class Lada implements Car{
    @Override
    public void song()
    {
        System.out.println("Неистовый рёв движка!");
    }
    @Override
    public void model()
    {
        System.out.println(" Lada 2107");
    }
}
