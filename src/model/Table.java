package model;

public class Table {
  private String identifier;
  private int maxSeats;
  private int numUsers;

  public Table(String identifier, int maxSeats) {
    this.identifier = identifier;
    this.maxSeats = maxSeats;
    numUsers = 0;
  }

  public int getNumUsers() {
    return numUsers;
  }

  public void setNumUsers(int numUsers) {
    this.numUsers = numUsers;
  }

  public String getIdentifier() {
    return identifier;
  }

  public int getMaxSeats() {
    return maxSeats;
  }
}
