package com.company.Persons;

public class Teacher extends Person {
    private String materie;

    public Teacher(String firstName, String lastName, String birthdate) {
        super(firstName, lastName, birthdate);
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "prenume='" + getFirstName() + "'," +
                "nume='" + getLastName() + "'," +
                "data de nastere='" + getBirthdate() + "'," +
                "materie='" + materie + '\'' +
                '}';
    }
}
