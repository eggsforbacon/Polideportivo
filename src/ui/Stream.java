package ui;
import model.*;
import java.io.IOException;
import java.util.*;

public class Stream {

  public static void clrsc() {
    try {
      new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void printPoolCapacity(Pool iPool, Scanner in) {
    int[] pplInThePool = iPool.calculateMaxOcupation();
    System.out.println("La maxima teorica es: " + pplInThePool[0]);
    System.out.println("La maxima teorica realista es: " + pplInThePool[1] + "\n");
    System.out.println("La maxima normal es: " + pplInThePool[2]);
    System.out.println("La maxima en pandemia es: " + pplInThePool[3] + "\n");
    continueM(in,"continue");
  }

  public static void continueM(Scanner in, String word) {
    System.out.println("(Any key + ENTER to " + word + "...)");
    in.next();
    clrsc();
  }
}
