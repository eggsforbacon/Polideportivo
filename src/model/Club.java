package model;

public class Club {
  private static final int MAX_CAPACITY = 200;
  private String clubName;
  private String adress;
  PicnicZone zone1, zone2;
  Court court1, court2, court3;
  Pool pool1, pool2, pool3;

  public Club(String clubName, String adress, PicnicZone z1, PicnicZone z2, Court c1, Court c2, Court c3, Pool p1, Pool p2, Pool p3) {
    this.clubName = clubName;
    this.adress = adress;
    zone1 = z1;
    zone2 = z2;
    court1 = c1;
    court2 = c2;
    court3 = c3;
    pool1 = p1;
    pool2 = p2;
    pool3 = p3;
  }

  public String getClubName() {
    return clubName;
  }

  public String getAdress() {
    return adress;
  }

  public static int getMAX_CAPACITY() {
    return MAX_CAPACITY;
  }

  public int totalClubUsers() {
    int clubUsers = 0;
    clubUsers = zone1.calculateUsers();
    clubUsers += zone2.calculateUsers();

    clubUsers += court1.getNumUsers();
    clubUsers += court2.getNumUsers();
    clubUsers += court3.getNumUsers();

    clubUsers += pool1.getNumUsers();
    clubUsers += pool2.getNumUsers();
    clubUsers += pool3.getNumUsers();

    return clubUsers;
  }

  public int availableSpots(boolean covidRestriction, int clubUsers) {
    int spotsLeft;
    double temp;
    if (covidRestriction = false) {
      spotsLeft = MAX_CAPACITY - clubUsers;
    }
    else {
      temp = (MAX_CAPACITY * (1 - 0.65)) - clubUsers;
      spotsLeft = (int)temp;
    }
    return spotsLeft;
  }
}
