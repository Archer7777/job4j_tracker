package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String timeOfOperation;

    public Surgeon(String name, String surname, String education, String birthday, String qualification, String timeOfOperation) {
        super(name, surname, education, birthday, qualification);
        this.timeOfOperation = timeOfOperation;
    }

    public String getTimeOfOperation() {
        return this.timeOfOperation;
    }
}
