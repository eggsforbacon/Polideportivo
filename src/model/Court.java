package model;

public class Court {
  private String courtName, sport;
  private double courtLength, width;
  private int numUsers;

  public Court(String courtName, String sport, double courtLength, double width) {
    this.courtName = courtName;
    this.sport = sport;
    this.courtLength = courtLength;
    this.width = width;
    numUsers = 0;
  }

  public int getNumUsers() {
    return numUsers;
  }

  public void setNumUsers(int numUsers) {
    this.numUsers = numUsers;
  }

  public String getCourtName() {
    return courtName;
  }

  public String getSport() {
    return sport;
  }
}
