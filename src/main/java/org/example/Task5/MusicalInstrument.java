package org.example.Task5;

public abstract class  MusicalInstrument {
    private String name;

    public MusicalInstrument(String name) {
        this.name = name;
    }

    public void Sound() {
        System.out.println("Звук музичного інструменту " + name + ":");
    }

    public void Show() {
        System.out.println("Назва музичного інструменту: " + name);
    }

    public void Desc() {
        System.out.println("Опис музичного інструменту " + name + ":");
    }

    public void History() {
        System.out.println("Історія створення музичного інструменту " + name + ":");
    }
    public void PlayAll(){
        this.Sound();
        this.Show();
        this.Desc();
        this.History();
    }
}
