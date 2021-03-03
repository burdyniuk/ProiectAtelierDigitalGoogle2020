package com.company.Strategy;

import com.company.Persons.Person;
import com.company.Persons.Teacher;
import com.company.School.School;

/**
 * Strategy to change teacher's school.
 */
public class TeacherChangeSchool implements Strategy {
    @Override
    public void execute(Person teacher, School from, School to) {
        from.getTeachers().remove(teacher);
        to.getTeachers().add((Teacher) teacher);
    }
}
