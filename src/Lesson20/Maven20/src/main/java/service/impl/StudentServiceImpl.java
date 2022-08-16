package service.impl;

import db.DBService;
import model.Student;
import service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public void getAll() throws SQLException, ClassNotFoundException {
        DBService.getAll();
    }

    @Override
    public void getById(List<Integer> id) throws SQLException, ClassNotFoundException {
        DBService.getByIds(id);
    }

    @Override
    public void getByName(String name) throws SQLException, ClassNotFoundException {
        DBService.getByName(name);
    }

    @Override
    public int addStudent(Student student) throws SQLException, ClassNotFoundException {
        DBService.addStudent(student);
        return 0;
    }

    @Override
    public void deleteStudent(int id) throws SQLException, ClassNotFoundException {
        DBService.deleteStudent(id);
    }
}
