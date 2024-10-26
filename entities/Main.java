package Layers.entities;
import Layers.business.CourseService;
import Layers.core.databaseLogger;
import Layers.dataAccess.*;
import Layers.core.Logger;
import Layers.entities.Course;

public class Main {
    public static void main(String[] args){

        Logger logger = new databaseLogger();

        CourseDao hibernateDao = new HibernateDao();
        hibernateDao.start();

        CourseService courseService = new CourseService(hibernateDao, logger);

        try {
            courseService.add("Java Programlama", 100);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }






    }
}
