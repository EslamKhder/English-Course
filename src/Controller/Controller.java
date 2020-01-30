package Controller;

import Model.LogIn;
import Model.Student;
import course.CoursesSql;

public class Controller {
    private CoursesSql courcessql;

    public Controller(){
        courcessql = new CoursesSql();
    }
    public int add(Student student) {
        return courcessql.add(student);
    }
    public int updateStudent(Student student) {
        return courcessql.updateStudent(student);
    }
    public Student getStudent(Student student) {
        return courcessql.getStudent(student);
    }
    
    public int removeStudent(Student student) {
        return courcessql.removeStudent(student);
    }
    public Student checkStudent(Student student) {
        return courcessql.checkStudent(student);
    }
    public int updateSerialCode(Student student) {
        return courcessql.updateSerialCode(student);
    }
    public LogIn getLogIn() {
        return courcessql.getLogIn();
    }
}
