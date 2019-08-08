package Model;

public class CardGroup6 extends Card {

  private final int SPEC_TYPE;

  private double dToPay;

  public CardGroup6 () {

    this.SPEC_TYPE = randomGen(1, 2);
    int multiplier = (int) Math.pow(10, randomGen(1, 2));

    if (this.SPEC_TYPE == 1)
     this.dToPay = (double) randomGen(1, 4) * multiplier;

    else
      this.dToPay = (double) randomGen(3, 6) * multiplier;

  }

  public int getType () {
    return this.SPEC_TYPE;
  }

  public double getPay () {
    return this.dToPay;
  }

}

