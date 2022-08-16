package service;

import model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    void getAll() throws SQLException, ClassNotFoundException;
    void getById(List<Integer> id) throws SQLException, ClassNotFoundException;
    void getByName(String name) throws SQLException, ClassNotFoundException;
    int addStudent(Student student) throws SQLException, ClassNotFoundException;
    void deleteStudent(int id) throws SQLException, ClassNotFoundException;
}
