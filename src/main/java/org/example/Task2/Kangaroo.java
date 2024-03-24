package org.example;

public class Kangaroo extends Animal{
    private String type;
    private int offspringCount;
    private String pouchSize;
    private String territory;
    private String behavior;
    private String diet;
    private String migration;
    private String health;

    public Kangaroo(String name, String type, int offspringCount, String pouchSize, String territory, String behavior, String diet, String migration, String health) {
        super(name);
        this.type = type;
        this.offspringCount = offspringCount;
        this.pouchSize = pouchSize;
        this.territory = territory;
        this.behavior = behavior;
        this.diet = diet;
        this.migration = migration;
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOffspringCount() {
        return offspringCount;
    }

    public void setOffspringCount(int offspringCount) {
        this.offspringCount = offspringCount;
    }

    public String getPouchSize() {
        return pouchSize;
    }

    public void setPouchSize(String pouchSize) {
        this.pouchSize = pouchSize;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getMigration() {
        return migration;
    }

    public void setMigration(String migration) {
        this.migration = migration;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }
    public void Show() {
        System.out.println("Kangaroo Information: Type - " + type + ", Offspring Count - " + offspringCount + ", Pouch Size - " + pouchSize + ", Territory - " + territory + ", Behavior - " + behavior + ", Diet - " + diet + ", Migration - " + migration + ", Health - " + health);
    }

}
