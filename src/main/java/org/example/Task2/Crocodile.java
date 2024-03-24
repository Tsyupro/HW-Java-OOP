package org.example;

public class Crocodile extends Animal{
    private String type;
    private String skinColor;
    private double length;
    private double weight;
    private String diet;
    private String habitat;
    private String territory;
    private String temperatureTolerance;
    private String health;

    public Crocodile(String name, String type, String skinColor, double length, double weight, String diet, String habitat, String territory, String temperatureTolerance, String health) {
        super(name);
        this.type = type;
        this.skinColor = skinColor;
        this.length = length;
        this.weight = weight;
        this.diet = diet;
        this.habitat = habitat;
        this.territory = territory;
        this.temperatureTolerance = temperatureTolerance;
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getTemperatureTolerance() {
        return temperatureTolerance;
    }

    public void setTemperatureTolerance(String temperatureTolerance) {
        this.temperatureTolerance = temperatureTolerance;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void Show() {
        System.out.println("Crocodile Information: Name - " + getName() +" Type - " + type + ", Skin Color - " + skinColor + ", Length - " + length + " meters, Weight - " + weight + " kilograms, Diet - " + diet + ", Habitat - " + habitat + ", Territory - " + territory + ", Temperature Tolerance - " + temperatureTolerance + ", Health - " + health);
    }

}
