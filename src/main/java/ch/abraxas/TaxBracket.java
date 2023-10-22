package ch.abraxas;

public class TaxBracket {

  private final double rate;
  private final double bound;

  public TaxBracket(double rate, double bound) {
    this.rate = rate;
    this.bound = bound;
  }

  /**
   * returns the rate in percent. 0.01 means 1%. 0.5 means 50%. 1.0 means 100%.
   */
  public double getRate() {
    return rate;
  }

  /**
   * The rate applies up to this bound.
   */
  public double getBound() {
    return bound;
  }

}
