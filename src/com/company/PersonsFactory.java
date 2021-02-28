package com.company;

import com.company.Persons.*;

public class PersonsFactory {
    private static PersonsFactory INSTANCE;

    public PersonsFactory() {
    }

    public static PersonsFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PersonsFactory();
        }
        return INSTANCE;
    }

    public Person createPerson(PersonType type, String firstName, String lastName, String birthdate) {
        switch (type) {
            case STUDENT:
                return new Student(firstName, lastName, birthdate);
            case TEACHER:
                return new Teacher(firstName, lastName, birthdate);
            case DIRECTOR:
                return new Director(firstName, lastName, birthdate);
        }
        return null;
    }
}
