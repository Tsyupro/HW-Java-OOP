package org.example;

public class Builder extends Human{
    String specialization;

    public Builder(String name, int age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void Show(){
      String info = GetInfo();
      info+=" Spec:" + specialization;
        System.out.println(info);
    }
}
