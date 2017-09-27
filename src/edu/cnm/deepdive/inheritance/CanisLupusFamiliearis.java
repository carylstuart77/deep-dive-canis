package edu.cnm.deepdive.inheritance;

public class CanisLupusFamiliearis extends CanisLupus {
  private boolean goodBoy;
  
  public CanisLupusFamiliearis(String name, int weight, boolean goodBoy) {
    super(name, weight);
    this.goodBoy = goodBoy;
  }

  public CanisLupusFamiliearis(String name, int weight) {
    this(name, weight, true);
  }

  /**
   * @return the goodBoy
   */
  public boolean isGoodBoy() {
    return goodBoy;
  }

  /**
   * @param goodBoy the goodBoy to set
   */
  public void setGoodBoy(boolean goodBoy) {
    this.goodBoy = goodBoy;
  }

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.inheritance.CanisLupus#speak()
   */
  @Override
  public void speak() {
    //inherited getName from 
    System.out.println(getName() + ": bark!");
  }

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.inheritance.Canis#hunt()
   */
  // Overriding hunt from inheritance is override
  @Override
  public void hunt() {
    System.out.println("Beg for food");
  }

}
