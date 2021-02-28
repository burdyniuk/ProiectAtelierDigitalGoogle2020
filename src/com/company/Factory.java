package com.company;

public class Factory {
    private static Factory INSTANCE;

    public Factory() {
    }

    public static Factory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Factory();
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
