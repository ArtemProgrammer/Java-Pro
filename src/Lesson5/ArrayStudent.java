public class ArrayStudent {
    public static Student[] students = new Student[10];
    static Student Artem = new Student(1, "Lushnya", "Artem", "Victorovich", 1999,
            "Odessa", "0979533936", "Biology", 4, "A");
    static Student Masha = new Student(2, "Kotova", "Masha", "Igorovna", 2000,
            "Odessa", "0634568521", "Math", 3, "B");
    static Student Grigoriy = new Student(3, "Voronov", "Grigoriy", "Andreevich", 2001,
            "Odessa", "0978794563", "Engineer", 2, "A");
    static Student Andrey = new Student(4, "Sergeev", "Andrey", "Ivanovich", 2002,
            "Odessa", "0965551135", "Math", 1, "C");
    static Student Sasha = new Student(5, "Solncev", "Sasha", "Petrovich", 2000,
            "Odessa", "0959654123", "Chemistry", 3, "D");
    static Student Ira = new Student(6, "Sovkova", "Ira", "Victorovna", 1999,
            "Odessa", "0664785214", "Geography", 4, "E");
    static Student Anna = new Student(7, "Voronina", "Anna", "Vyacheslavovna", 2001,
            "Odessa", "0977456395", "Physics", 2, "C");
    static Student Vika = new Student(8, "Krotova", "Vika", "Artyomovna", 1999,
            "Odessa", "0668794563", "History", 2, "D");
    static Student Polya = new Student(9, "Sotova", "Polya", "Kirillovna", 2002,
            "Odessa", "0950991475", "Math", 1, "F");
    static Student Vadim = new Student(10, "Okonov", "Vadim", "Anatolievich", 1999,
            "Odessa", "0660258964", "History", 2, "A");

    public static Student[] getStudent() {
        students[0] = Artem;
        students[1] = Masha;
        students[2] = Grigoriy;
        students[3] = Andrey;
        students[4] = Sasha;
        students[5] = Ira;
        students[6] = Anna;
        students[7] = Vika;
        students[8] = Polya;
        students[9] = Vadim;
        return students;
    }
}
