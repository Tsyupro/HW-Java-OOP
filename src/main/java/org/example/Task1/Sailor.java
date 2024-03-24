package org.example.Task1;

public class Sailor extends Human{
    String shipName;

    public Sailor(String name, int age, String gender, String shipName) {
        super(name, age, gender);
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void Show(){
      String info = GetInfo();
      info+=" shipName:" + shipName;
      System.out.println(info);
    }
}
