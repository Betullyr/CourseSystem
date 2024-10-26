package Layers.dataAccess;
import Layers.entities.Course;
import java.util.List;
import java.util.ArrayList;

public interface CourseDao {
   List<Course> courses = new ArrayList<>();

   public void start();

   public boolean getCourseByName(String name);

   public void add(String name, int price);
}
