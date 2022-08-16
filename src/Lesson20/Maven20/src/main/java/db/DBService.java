package db;

import exception.UserNotFoundException;
import model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }
    private static final String URL = "jdbc:mysql://localhost:3306/db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rootroot";

    public static void addStudent(Student student) throws SQLException, ClassNotFoundException {
        String query = "insert into Student (full_name, year_of_admission) values ('%s', '%s')";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate(String.format(query, student.getFullName(), student.getYearOfAdmission()));
        connection.close();
    }

    public static void deleteStudent(int id) throws SQLException, ClassNotFoundException {
        String query = "delete from Student where id = '" + id + "'";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        connection.close();
    }

    public static List<Student> getAll() throws SQLException, ClassNotFoundException {
        String query = "select * from Student";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String fullName = resultSet.getString("full_name");
            int yearOfAdmission = resultSet.getInt("year_of_admission");
            students.add(new Student(id, fullName, yearOfAdmission));
        }
        connection.close();
        return students;
    }

    public static List<Student> getByName(String name) throws SQLException, ClassNotFoundException {
        String query = "select * from Student where full_name = '" + name + "'";
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String fullName = resultSet.getString("full_name");
            int yearOfAdmission = resultSet.getInt("year_of_admission");
            students.add(new Student(id, fullName, yearOfAdmission));
        }
        connection.close();
        return students;
    }

    public static List<Student> getByIds(List<Integer> ids) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        StringBuilder sbSql = new StringBuilder(1024);
        sbSql.append("SELECT * FROM Student WHERE id IN(");

        for (int i = 0; i < ids.size(); i++) {
            if (i > 0) sbSql.append(",");
            sbSql.append(" ?");
        }
        sbSql.append(" )");
        PreparedStatement pst = connection.prepareStatement(String.valueOf(sbSql));

        for (int i = 0; i < ids.size(); i++) {
            pst.setInt(i + 1, ids.get(i));
        }

        ResultSet rs = pst.executeQuery();
        List<Student> student = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String fullName = rs.getString("full_name");
            int yearOfAdmission = rs.getInt("year_of_admission");
            student.add(new Student(id, fullName, yearOfAdmission));
        }
        connection.close();

        if (student.isEmpty()) {
            throw new UserNotFoundException(String.valueOf(ids));
        } else {
            return student;
        }
    }
}
