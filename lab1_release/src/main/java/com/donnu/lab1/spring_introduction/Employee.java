package com.donnu.lab1.spring_introduction;



public class Employee {
    private Pet pet;
    private Car car;
    private String name;
    private int age;

    public Employee(){}

   /* public Employee(Pet pet){
        this.pet=pet;
    }
    public Employee(Car car){
        this.car=car;
    }*/

    public void setPet(Pet pet){this.pet=pet;}
    public void setCar(Car car){this.car=car;}
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public String getName(){return name;}
    public int getAge(){return age;}


    public void callYourPet(){
        System.out.println("Hey!");
        pet.say();
    }
    public void showYourCar()
    {
        System.out.println("Look!");
        car.song();
        car.model();
    }
}
