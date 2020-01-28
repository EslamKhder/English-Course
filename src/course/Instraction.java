/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eng Eslam Khder
 */
public interface Instraction {
    // . Student add function
    public int add(Student student);
    // . Student fetch function
    public Student getStudent(Student student);
    // . Student deletion function
    public int removeStudent(Student student);
    // . Modification function for student information
    public int updateStudent(Student student);
    // . Logging function
    public LogIn getLogIn();
    // Checking function
    public Student checkStudent(Student student);
    //. Serial number retrieval function
    public int updateSerialCode(Student student);
}
