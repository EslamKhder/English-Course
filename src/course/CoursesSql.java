package course;
import Model.LogIn;
import Model.Student;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/* 
    This class contains
        1. Contact DataData
        2. Student add function
        3. Student deletion function
        4. Student fetch function
        5. Modification function for student information
        6. Serial number retrieval function
        7. Logging function
        8. Checking function
*/
public class CoursesSql implements Instraction{

    private final String DRIVER = "com.mysql.jdbc.Driver",
            URL = "jdbc:mysql://localhost:3306/me",
            USERNAME = "root",
            PASSWORD = "";
    private Connection connection = null;
    private PreparedStatement preparedstatement = null;
    private String instraction = null;
    private int result = 0;
    
    // . Connect DataData
    public CoursesSql() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(
                    URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error Because " + e.toString(),
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // . Student add function
    @Override
    public int add(Student student) {
        instraction = "INSERT INTO COURSE (NameF, NameL, Age, SerialCode) values "
                + "(?, ?, ?, ?)";
        try {
            preparedstatement = connection.prepareStatement(instraction);
            preparedstatement.setString(1, student.getNamef());
            preparedstatement.setString(2, student.getNamel());
            preparedstatement.setInt(3, student.getAge());
            preparedstatement.setString(4, student.getSerialcode());
            result = preparedstatement.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Enter Another Serial Code",
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
        }

        return result;
    }
    // . Student fetch function
    @Override
    public Student getStudent(Student student) {
        instraction = "SELECT * FROM COURSE WHERE SERIALCODE = ?";
        try {
            preparedstatement = connection.prepareStatement(instraction);
            preparedstatement.setString(1, student.getSerialcode());
            ResultSet resultset = preparedstatement.executeQuery();
            if (resultset.next()) {
                student.setId(resultset.getInt(1));
                student.setNamef(resultset.getString(2));
                student.setNamel(resultset.getString(3));
                student.setAge(resultset.getInt(4));
                student.setSerialcode(resultset.getString(5));
            } else {
                JOptionPane.showMessageDialog(null, "This Student Doesnot Exist",
                        "Connection Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Because " + e.toString(),
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        return student;
    }
    // . Student deletion function
    @Override
    public int removeStudent(Student student) {
        instraction = "DELETE FROM COURSE WHERE NAMEF = ? AND NAMEL = ? AND SERIALCODE = ?";
        try {
            preparedstatement = connection.prepareStatement(instraction);
            preparedstatement.setString(1, student.getNamef());
            preparedstatement.setString(2, student.getNamel());
            preparedstatement.setString(3, student.getSerialcode());
            result = preparedstatement.executeUpdate();
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "Correct Your Data ",
                        "Connection Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error Because " + e.toString(),
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
    // . Modification function for student information
    @Override
    public int updateStudent(Student student) {
        instraction = "UPDATE COURSE SET NameF = ?, NameL = ?, Age = ? WHERE SERIALCODE = ? ";
        try {
            preparedstatement = connection.prepareStatement(instraction);
            preparedstatement.setString(1, student.getNamef());
            preparedstatement.setString(2, student.getNamel());
            preparedstatement.setInt(3, student.getAge());
            preparedstatement.setString(4, student.getSerialcode());
            result = preparedstatement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Because " + e.toString(),
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
    // . Logging function
    @Override
    public LogIn getLogIn() {
        instraction = "SELECT * FROM LogIn";
        LogIn login = new LogIn();
        try {
            preparedstatement = connection.prepareStatement(instraction);
            ResultSet resultset = preparedstatement.executeQuery();
            if (resultset.next()) {
                login.setUsername(resultset.getString(1));
                login.setPassword(resultset.getString(2));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Because " + e.toString(),
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        return login;
    }
    // Checking function
    @Override
    public Student checkStudent(Student student) {
        instraction = "SELECT * FROM COURSE WHERE ID = ?";
        try {
            preparedstatement = connection.prepareStatement(instraction);
            preparedstatement.setString(1, String.valueOf(student.getId()));
            ResultSet resultset = preparedstatement.executeQuery();
            if (resultset.next()) {
                student.setId(resultset.getInt(1));
                student.setNamef(resultset.getString(2));
                student.setNamel(resultset.getString(3));
                student.setAge(resultset.getInt(4));
                student.setSerialcode(resultset.getString(5));
            } else {
                JOptionPane.showMessageDialog(null, "This Student Doesnot Exist",
                        "Connection Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Because " + e.toString(),
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        return student;
    }
    //. Serial number retrieval function
    @Override
    public int updateSerialCode(Student student) {
        instraction = "UPDATE COURSE SET SERIALCODE = ? WHERE ID = ?";
        try {
            preparedstatement = connection.prepareStatement(instraction);
            
            preparedstatement.setString(1, student.getSerialcode());
            preparedstatement.setString(2, String.valueOf(student.getId()));
            result = preparedstatement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Because " + e.toString(),
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

}
