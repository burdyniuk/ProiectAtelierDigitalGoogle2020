package com.company;

import java.util.ArrayList;

public class School {
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    Director director;

    public School(ArrayList<Student> students, ArrayList<Teacher> teachers, Director director) {
        this.students = students;
        this.teachers = teachers;
        this.director = director;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", teachers=" + teachers +
                ", director=" + director +
                '}';
    }
}
