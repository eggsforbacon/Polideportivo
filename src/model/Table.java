package model;

public class Table {
  private String identifier;
  private int maxSeats;
  private int numUsers;

  public Table(String identifier, int maxSeats, int numUsers) {
    this.identifier = identifier;
    this.maxSeats = maxSeats;
    this.numUsers = numUsers;
  }

  public int getNumUsers() {
    return numUsers;
  }

  public String getIdentifier() {
    return identifier;
  }
}
