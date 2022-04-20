package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String typeWork;

    public Builder(String name, String surname, String education, String birthday, int age, String typeWork) {
        super(name, surname, education, birthday, age);
        this.typeWork = typeWork;
    }

    public String getTypeWork() {
        return this.typeWork;
    }
}
