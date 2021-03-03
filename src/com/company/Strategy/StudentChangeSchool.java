package com.company.Strategy;

import com.company.Persons.Person;
import com.company.Persons.Student;
import com.company.School.School;

/**
 * Strategy to change student's school.
 */
public class StudentChangeSchool implements Strategy {
    @Override
    public void execute(Person student, School from, School to) {
        from.getStudents().remove(student);
        to.getStudents().add((Student) student);
    }
}
