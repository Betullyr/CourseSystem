package Layers.dataAccess;
import Layers.entities.Course;

import java.util.List;
import java.util.ArrayList;


public class HibernateDao implements CourseDao{

    List<Course> courses = new ArrayList<>();

    public void start(){
        System.out.println("Hibernate bağlantısı sağlandı");
    }

    public boolean getCourseByName(String name) {
        for (Course course : courses) {
            if (course.getName().equals(name)) {
                return true; // Kurs bulundu
            }
        }
        return false; // Kurs bulunamadı
    }

    public void add(String name, int price){}
}
