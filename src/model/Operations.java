package model;
public class Operations {

  public static String calcPerc(int probe, int part) {
    double perc = (part / probe) * 100;
    String ret = perc + "%";
    return ret;
  }

  public static String checkForOverflow(int overflow) {
    String ret2 = "";
    if (overflow < 0) {
      overflow *= -1;
      ret2 = overflow + " personas deben abandonar el club para garantizar la bioseguridad.";
    }
    else {
      ret2 = "Todo correcto! Buen dia :)";
    }
    return ret2;
  }
}
