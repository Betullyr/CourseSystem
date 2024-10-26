package Layers.entities;

public class Catagory {
    private int id;
    private String name;

    public Catagory() {
    }

    public Catagory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
