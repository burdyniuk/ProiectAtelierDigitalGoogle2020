package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Factory personFactory = Factory.getInstance();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        Student st1 = (Student) personFactory.createPerson(PersonType.STUDENT,
                "Ilie", "Burdiniuc", "02.03.2000");
        st1.setClasa(10);
        students.add(st1);
        Teacher t1 = (Teacher) personFactory.createPerson(PersonType.TEACHER,
                "Salleh", "...", "01.01.1995");
        t1.setMaterie("JAVA");
        Teacher t2 = (Teacher) personFactory.createPerson(PersonType.TEACHER,
                "Adina-Magda", "Florea", "02.05.1979");
        t2.setMaterie("Structuri de date");
        teachers.add(t1);
        teachers.add(t2);
        Director director1 = (Director) personFactory.createPerson(PersonType.DIRECTOR,
                "Viorica", "Bujor", "03.09.1972");
        School sc1 = new School(students, teachers, director1);
        System.out.println(sc1);

    }
}
