package com.zoarial;

public class TestMonster {

    public static void main(String[] args) {

        Monster m1 = new FireMonster("FireMonster");
        Monster m2 = new WaterMonster("This is the monster name");
        Monster m3 = new StoneMonster("This is the monster name");
        Monster m4 = new Monster("Regular Monster");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
        System.out.println(m4.attack());


        System.out.println("Monster 1 name: " + m1.getName());
        System.out.println("Monster 2 name: " + m2.getName());

    }

}
