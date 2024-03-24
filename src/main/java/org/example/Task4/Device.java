package org.example.Task4;

public abstract class Device {
    private String name;
    private String abount;

    public Device(String name, String abount) {
        this.name = name;
        this.abount = abount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbount() {
        return abount;
    }

    public void setAbount(String abount) {
        this.abount = abount;
    }

}
