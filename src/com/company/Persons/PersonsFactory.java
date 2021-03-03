package com.company.Persons;

public class PersonsFactory {
    // singleton pattern
    private static PersonsFactory INSTANCE;

    public PersonsFactory() {
    }

    public static PersonsFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PersonsFactory();
        }
        return INSTANCE;
    }

    // factory for persons
    public Person createPerson(PersonType type, String firstName, String lastName, String birthdate) {
        return switch (type) {
            case STUDENT -> new Student(firstName, lastName, birthdate);
            case TEACHER -> new Teacher(firstName, lastName, birthdate);
            case DIRECTOR -> new Director(firstName, lastName, birthdate);
        };
    }
}
