package model;

public class PicnicZone {

  private String zoneName;
  private Table table1, table2, table3, table4;

  public PicnicZone(String zoneName, Table t1, Table t2, Table t3, Table t4) {
    this.zoneName = zoneName;
    table1 = t1;
    table2 = t2;
    table3 = t4;
    table4 = t4;
  }

  public String getZoneName() {
    return zoneName;
  }

  public int calculateUsers() {
    int totPZusers = 0;
    totPZusers += table1.getNumUsers();
    totPZusers += table2.getNumUsers();
    totPZusers += table3.getNumUsers();
    totPZusers += table4.getNumUsers();
    return totPZusers;
  }
}
