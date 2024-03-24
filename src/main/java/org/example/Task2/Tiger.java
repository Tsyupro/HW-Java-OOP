package org.example;

public class Tiger extends Animal {
    private String diet;
    private String skin;
    private double length;
    private double height;
    private double weight;
    private String behavior;
    private String habitat;
    private String lifestyle;
    private String territory;
    private String reproduction;
    private String health;

    public Tiger(String name, String diet, String skin, double length, double height, double weight, String behavior, String habitat, String lifestyle, String territory, String reproduction, String health) {
        super(name);
        this.diet = diet;
        this.skin = skin;
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.behavior = behavior;
        this.habitat = habitat;
        this.lifestyle = lifestyle;
        this.territory = territory;
        this.reproduction = reproduction;
        this.health = health;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void Show() {
        System.out.println("Tiger Information: Name - " + getName() + " Diet - " + diet + ", Skin - " + skin + ", Length - " + length + " meters, Height - " + height + " meters, Weight - " + weight + " kilograms, Behavior - " + behavior + ", Habitat - " + habitat + ", Lifestyle - " + lifestyle + ", Territory - " + territory + ", Reproduction - " + reproduction + ", Health - " + health);
    }

}
