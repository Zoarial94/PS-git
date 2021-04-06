package com.zoarial;

public class Monster {

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   protected String name;

   public Monster(String name) {

      this.name = name;

   }

   public String attack() {

      return "I don't know how to attack";

   }

}
