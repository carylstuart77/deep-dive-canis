package edu.cnm.deepdive.inheritance;

public class CallOfTheWild {
  private CallOfTheWild() {
  
  }
  public static void main(String[] args) {
    //
    Canis dogA = new CanisLupus("Buck", 175);
    Canis dogB = new CanisLupusFamiliearis("Fido", 75);
    
    dogA.hunt();
    dogB.hunt();
    //Type cast; CanisLupus has a dogA
    ((CanisLupus) dogA).speak();
    ((CanisLupus) dogB).speak();
  }

}
