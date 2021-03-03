package com.company.Strategy;

import com.company.Persons.Person;
import com.company.School.School;

/**
 * Class to use strategies.
 */
public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Person person, School from, School to) {
        strategy.execute(person, from, to);
    }
}
