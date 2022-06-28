package Lesson5;
public class StudentMethods {
    //Вывод по факультету
    public static void checkFaculty(Student[] students, String faculty) {
        System.out.println("Вывод студентов по факультету " + faculty + ":");
        for (Student st : students) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
        System.out.println();
    }

    //Вывод по факультету и курсу
    public static void checkFacultyAndCourse(Student[] students, String faculty, int course) {
        System.out.println("Вывод студентов по факультету " + faculty + " и номеру курса " + course + ":");
        for (Student st : students) {
            if (st.getFaculty().equals(faculty) && st.getCourse() == course) {
                System.out.println(st.toString());
            }
        }
        System.out.println();
    }

    //Вывод cтудентов старше указанного года
    public static void checkStudentYear(Student[] students, int year) {
        System.out.println("Вывод студентов старше указанного года рождения " + year + ":");
        for (Student st : students) {
            if (st.getYear() > year) {
                System.out.println(st.toString());
            }
        }
        System.out.println();
    }

    //Вывод по списку группы
    public static void checkStudentGroup(Student[] students, String group) {
        System.out.println("Вывод студентов по группе " + group + ":");
        for (Student st : students) {
            if (st.getGroup().equals(group)) {
                System.out.println(st.toString());
            }
        }
        System.out.println();
    }
}
