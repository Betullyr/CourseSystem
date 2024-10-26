package Layers.business;
import Layers.dataAccess.CourseDao;
import Layers.core.Logger;
import Layers.entities.Course;

import java.util.List;

public class CourseService {
    private CourseDao courseDao;
    private Logger logger;

    public CourseService(CourseDao courseDao, Logger logger){
        this.courseDao = courseDao;
        this.logger = logger;
    }



    public void add(String name, int price) throws Exception{
        if(courseDao.getCourseByName(name)){
            throw new Exception("Kurs zaten mevcut");
        }
        else {
            if(price <= 0){
                throw new Exception("Kurs Ücreti 0'dan küçük olamaz");
            }

            else{
                 courseDao.add(name, price);
                 logger.log();
            }

        }
    }


}
