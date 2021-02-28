package com.company;

import com.company.Persons.Director;
import com.company.Persons.PersonType;
import com.company.Persons.Student;
import com.company.Persons.Teacher;
import com.company.School.School;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonsFactory personFactory = PersonsFactory.getInstance();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        Student st1 = (Student) personFactory.createPerson(PersonType.STUDENT,
                "Ilie", "Burdiniuc", "02.03.2000");
        st1.setClasa(10);
        students.add(st1);
        Student st2 = (Student) personFactory.createPerson(PersonType.STUDENT,
                "Razvan", "Abagiu", "04.06.2000");
        st2.setClasa(10);
        students.add(st2);
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



        ArrayList<Student> students2 = new ArrayList<>();
        ArrayList<Teacher> teachers2 = new ArrayList<>();
        Director director2 = (Director) personFactory.createPerson(PersonType.DIRECTOR,
                "Tatiana", "Fistic", "08.03.1985");
        Student st3 = (Student) personFactory.createPerson(PersonType.STUDENT,
                "Cristian", "Apostol", "09.05.2000");
        st3.setClasa(11);
        Student st4 = (Student) personFactory.createPerson(PersonType.STUDENT,
                "Andrei", "Isciuc", "12.10.2001");
        st4.setClasa(9);
        students2.add(st3);
        students2.add(st4);
        Teacher t3 = (Teacher) personFactory.createPerson(PersonType.TEACHER,
                "Elena", "Albot", "08.11.1974");
        t3.setMaterie("Matematica");
        Teacher t4 = (Teacher) personFactory.createPerson(PersonType.TEACHER,
                "Ana", "Hrapov", "19.08.1973");
        t4.setMaterie("Geografia");
        teachers2.add(t3);
        teachers2.add(t4);
        School sc2 = new School(students2, teachers2, director2);
        System.out.println(sc2);
    }
}
