package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String numberOfTooth;

    public Dentist(String name, String surname, String education, String birthday, String qualification, String numberOfTooth) {
        super(name, surname, education, birthday, qualification);
        this.numberOfTooth = numberOfTooth;
    }

    public String getNumberOfTooth() {
        return this.numberOfTooth;
    }
}
