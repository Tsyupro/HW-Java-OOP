package org.example;

public  class Human {
    private String name;
    private int age;
    private String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void Show(){
        System.out.println("Info: " + "Name: " + name + " Age: " + age+ " Gender:" + gender);
    }
    public String GetInfo(){
        return "Info: " + "Name: " + name + " Age: " + age+ " Gender:" + gender;

    }

}
