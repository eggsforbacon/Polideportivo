package model;

public class Club {
  private final int MAX_CAPACITY = 200;
  private String clubName;
  private String adress;
  PicnicZone zone1, zone2;
  Court court1, court2, court3;

  public Club(String clubName, String adress, PicnicZone z1, PicnicZone z2) {
    this.clubName = clubName;
    this.adress = adress;
    zone1 = z1;
    zone2 = z2;

  }

  public String getClubName() {
    return clubName;
  }

  public String getAdress() {
    return adress;
  }

  public int getMAX_CAPACITY() {
    return MAX_CAPACITY;
  }

  public int totalClubUsers() {
    int clubUsers = 0;
    clubUsers = zone1.calculateUsers();
    return clubUsers;
  }

  public int availableSpots(boolean covidRestriction, int clubUsers) {
    int spotsLeft;
    if (covidRestriction = false) {
      spotsLeft = MAX_CAPACITY - clubUsers;
    }
    else {
      spotsLeft = (MAX_CAPACITY * (1 - 0.75)) - clubUsers;
    }
    return spotsLeft;
  }
}
