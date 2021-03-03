package com.company.School;

import com.company.Persons.Director;
import com.company.Persons.Student;
import com.company.Persons.Teacher;

import java.util.ArrayList;

/**
 * School's class.
 */
public class School {
    String name;
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    Director director;

    public School(String name, ArrayList<Student> students, ArrayList<Teacher> teachers, Director director) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "name=" + name +
                ", students=" + students +
                ", teachers=" + teachers +
                ", director=" + director +
                '}';
    }
}
