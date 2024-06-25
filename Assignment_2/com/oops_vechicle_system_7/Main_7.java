package com.oops_vechicle_system_7;

abstract class Vehicle
{
 String make;
 String model;
 
 public Vehicle(String make, String model) 
 {
     this.make = make;
     this.model = model;
 }
 
 abstract void accelerate();
 abstract void brake();
}

class Car extends Vehicle {
 int numOfDoors;
 
 public Car(String make, String model, int numOfDoors) 
 {
     super(make, model);
     this.numOfDoors = numOfDoors;
 }
 
 @Override
 void accelerate() {
     System.out.println("Car is accelerating");
 }
 
 @Override
 void brake() {
     System.out.println("Car is braking");
 }
}

class Motorcycle extends Vehicle {
 boolean hasFairing;
 
 public Motorcycle(String make, String model, boolean hasFairing) {
     super(make, model);
     this.hasFairing = hasFairing;
 }
 
 @Override
 void accelerate() {
     System.out.println("Motorcycle is accelerating");
 }
 
 @Override
 void brake() {
     System.out.println("Motorcycle is braking");
 }
}

public class Main_7  
{
 public static void main(String[] args) {
     Vehicle[] veh = new Vehicle[2];
     
     veh[0] = new Car("BMW", "Camry", 4);
     
     veh[1] = new Motorcycle("yamaha", "CBR78654", true);
     
     for (Vehicle vehicle : veh) {
         System.out.println("Vehicle: " + vehicle.make + " " + vehicle.model);
         vehicle.accelerate();
         vehicle.brake();
         System.out.println();
     }
 }
}

