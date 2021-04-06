package com.zoarial;

public class Employee {

    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double Hra = 1000.50;

    public Employee(long id, String name, String address, long phone) {

        employeeId = id;
        employeeName = name;
        employeeAddress = address;
        employeePhone = phone;

    }

    void calculateSalary() {
        double salary =  basicSalary + ( basicSalary * specialAllowance / 100 ) + ( basicSalary * Hra / 100);
        System.out.println(salary);
    }

    void calculateTransportAllowance() {
        double transportAllowance = 10/100.0*basicSalary;
        System.out.println(transportAllowance);
    }

}
