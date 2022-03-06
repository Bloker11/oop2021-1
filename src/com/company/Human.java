package com.company;

import com.company.devices.Phone;

public class Human extends Animal {
    String firstName;
    String lastName;
    Animal pet;
    Phone phone;

    public final static String HUMAN_SPECIE = "homo sapiens";
    public final static FoodType HUMAN_FOODTYPE = FoodType.ALL;
    public final static Double HUMAN_WEIGHT = 80.0;
    private Double salary;

    Human(Double salary) {
        super(HUMAN_SPECIE, HUMAN_FOODTYPE,HUMAN_WEIGHT);
        this.setSalary(salary);
    }

    public Double getSalary() {
        //check the access rights of the user
        //log some information
        //check if we have a value in cache
        //if not read it from database
        return this.salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("NOBODY WILL PAY FOR WORKING");
            this.salary = 0.0;
        }
    }

}
