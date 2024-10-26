package Layers.entities;

public class Course {
    private int id;
    private String name;
    private int price;
    Instructor instructor;

    public Course() {

    }

    public Course(String name, int price, Instructor instructor) {
        this.name = name;
        this.price = price;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
