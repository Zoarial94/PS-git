package com.zoarial;

public class Main {

    public static void main(String[] args) {

        Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        Trainee t = new Trainee(239846, "Jack", "Mumbia India", 442085, 45000);

        m.calculateSalary();
        t.calculateSalary();

        m.calculateTransportAllowance();
        t.calculateTransportAllowance();


    }
}
