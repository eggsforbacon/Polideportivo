package model;

public class Court {
  private String courtName, sport;
  private double courtLength, width;
  private int numUsers;

  public Court(String courtName, String sport, double courtLength, double width, int numUsers) {
    this.courtName = courtName;
    this.sport = sport;
    this.courtLength = courtLength;
    this.width = width;
    this.numUsers = numUsers;
  }

  public int getNumUsers() {
    return numUsers;
  }

  public String getCourtName() {
    return courtName;
  }

  public String getSport() {
    return sport;
  }
}
