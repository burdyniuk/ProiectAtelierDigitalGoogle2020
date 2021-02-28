package com.company;

public class Student extends Person {
    private int clasa = 0;

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public Student(String firstName, String lastName, String birthdate) {
        super(firstName, lastName, birthdate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "prenume='" + getFirstName() + "'," +
                "nume='" + getLastName() + "'," +
                "data de nastere='" + getBirthdate() + "'," +
                "clasa=" + clasa +
                '}';
    }
}
