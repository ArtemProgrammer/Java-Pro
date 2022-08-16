package model;

public class Student {
    int id;
    String fullName;
    int yearOfAdmission;

    public Student() {}

    public Student(String fullName, int yearOfAdmission) {
        this.fullName = fullName;
        this.yearOfAdmission = yearOfAdmission;
    }

    public Student(int id, String fullName, int yearOfAdmission) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                '}';
    }
}
