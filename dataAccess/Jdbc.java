package Layers.dataAccess;

import Layers.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Jdbc implements CourseDao{
    List<Course> courses = new ArrayList<>();

    public void start(){
        System.out.println("Jdbc bağlantısı sağlandı");
    }

    public boolean getCourseByName(String name) {
        for (Course course : courses) {
            if (course.getName().equals(name)) {
                return true; // Kurs bulundu
            }
        }
        return false; // Kurs bulunamadı
    }

    public void add(String name, int price){
    }


}
