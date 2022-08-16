import db.DBService;
import model.*;
import service.StudentService;
import service.impl.StudentServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentService studentService = new StudentServiceImpl();
        studentService.getAll();
        studentService.getByName("Vadim");
        List<Integer> listOfId = new ArrayList<>();
        listOfId.add(1);
        listOfId.add(2);
        studentService.getById(listOfId);
        studentService.addStudent(new Student("Ivan", 5050));
        studentService.deleteStudent(10);
    }
}
