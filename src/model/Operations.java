package model;
import java.io.IOException;

public class Operations {

  public static void clrsc() {
    try {
      new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }
    catch (Exception e) {
      System.out.println(e);
    }
    
  }
}
