public class Main {
    public static void main(String[] args) {
        StudentMethods.checkFaculty(ArrayStudent.getStudent(), "Math");
        StudentMethods.checkFacultyAndCourse(ArrayStudent.getStudent(), "History", 2);
        StudentMethods.checkStudentYear(ArrayStudent.getStudent(),2000);
        StudentMethods.checkStudentGroup(ArrayStudent.getStudent(),"A");
    }
}
