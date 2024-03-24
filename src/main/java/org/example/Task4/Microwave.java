package org.example.Task4;

public class Microwave extends Device{
    private String song;

    public Microwave(String name, String abount, String song) {
        super(name, abount);
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
    public void Sound(){
        System.out.println("Sound: "+ song);
    }
    public void Show(){
        System.out.println("Name: "+ getName() );
    }
    public void Desc(){
        System.out.println("Info "+ getAbount());
    }
    public void PlayAll(){
        this.Show();
        this.Desc();
        this.Sound();
    }
}
