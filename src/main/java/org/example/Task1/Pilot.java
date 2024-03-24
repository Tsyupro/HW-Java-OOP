package org.example;

public class Pilot extends Human{
    String aircraftType;

    public Pilot(String name, int age, String gender, String aircraftType) {
        super(name, age, gender);
        this.aircraftType = aircraftType;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void Show(){
      String info = GetInfo();
      info+=" aircraftType:" + aircraftType;
      System.out.println(info);
    }
}
