package edu.cnm.deepdive.inheritance;

public class CanisLupus extends Canis {

  public CanisLupus(String name, int weight) {
    //Initialize from superclass
    //Changed constructor call
    super(name, weight);
    
  }
  public void speak() {
    //It was a method in the superclass Canis.
    // use this.xx to get list of methods 
    System.out.println(getName() + "howl!");
  }
}
