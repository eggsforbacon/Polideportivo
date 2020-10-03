package ui;
import model.*;

public class Main {
  public static void main(String[] args) {
    //Tables for the first picnic zone
    model.Table table1_1 = new Table("Mesa 1",6,4);
    model.Table table1_2 = new Table("Mesa 2",6,4);
    model.Table table1_3 = new Table("Mesa 3",6,0);
    model.Table table1_4 = new Table("Mesa 4",6,0);

    //Tables fot the second picnic zone
    model.Table table2_1 = new Table("Mesa 1",10,7);
    model.Table table2_2 = new Table("Mesa 2",10,0);
    model.Table table2_3 = new Table("Mesa 3",10,0);
    model.Table table2_4 = new Table("Mesa 4",10,0);

    //Picnic zones
    model.PicnicZone pZone1 = new PicnicZone("Los Sauces",table1_1,table1_2,table1_3,table1_4);
    model.PicnicZone pZone2 = new PicnicZone("La Ceiba",table2_1,table2_2,table2_3,table2_4);

    //Courts
    model.Court cCourt1 = new Court("Girasoles","Tenis",23.77,8.23,6);
    model.Court cCourt2 = new Court("Margaritas","Futbol",90,45,15);
    model.Court cCourt3 = new Court("Hortensias","Voleibol",18,9,12);
  }
}
