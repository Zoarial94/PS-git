package com.zoarial;

public class Manager extends Employee {

    public Manager(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone);
        this.basicSalary = salary;

    }

    @Override
    void calculateTransportAllowance() {
        double transportAllowance = 15/100.0*basicSalary;
        System.out.println(transportAllowance);
    }

}
