package com.company.Strategy;

import com.company.Persons.Person;
import com.company.School.School;

/**
 * Strategy interface.
 */
public interface Strategy {
    void execute(Person person, School from, School to);
}
