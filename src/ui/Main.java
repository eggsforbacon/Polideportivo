package ui;
import model.*;
import java.util.*;

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

    //Pools
    model.Pool pPool1 = new Pool("Delfines",30,20,1.5,13);
    model.Pool pPool2 = new Pool("Castores",9,8,0.5,8);
    model.Pool pPool3 = new Pool("Manaties",50,25,2.5,30);

    //Club
    model.Club club1 = new Club("Unidad Recreativa Caniaveralejo","Carrera 62 Esquina, Calle 6A",pZone1,pZone2,cCourt1,cCourt2,cCourt3,pPool1,pPool2,pPool3);

    //Interface
    Scanner in = new Scanner(System.in);
    Stream.clrsc();
    System.out.println("Polideportivo \'" + club1.getClubName() + "\'.\n" + club1.getAdress() + ".");
    System.out.println("Capacidad maxima de piscina \'" + pPool1.getPoolName() + "\':\n");
    Stream.printPoolCapacity(pPool1,in);

    System.out.println("Polideportivo \'" + club1.getClubName() + "\'.\n" + club1.getAdress() + ".");
    System.out.println("Capacidad maxima de piscina \'" + pPool2.getPoolName() + "\':\n");
    Stream.printPoolCapacity(pPool2,in);

    System.out.println("Polideportivo \'" + club1.getClubName() + "\'.\n" + club1.getAdress() + ".");
    System.out.println("Capacidad maxima de piscina \'" + pPool3.getPoolName() + "\':\n");
    Stream.printPoolCapacity(pPool3,in);

    System.out.println("Hay " + club1.totalClubUsers() + " usuarios en el club. (" + Operations.calcPerc(70,club1.totalClubUsers()) + ")\n");
    int spLeft = club1.availableSpots(true,club1.totalClubUsers());
    System.out.println(Operations.calcPerc(70,spLeft) + " de los cupos libres (" + spLeft + " cupos).");
    Stream.continueM(in,"continue");

    System.out.println(Operations.checkForOverflow(spLeft));
    Stream.continueM(in,"exit");
  }
}
