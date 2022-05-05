package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFIO("Пудовкин Алексей Геннадьевич");
        student.setGroup("Java стажер");
        student.setOfBegin(new Date());

        System.out.println(student.getFIO() + " начал обучение в группе " + student.getGroup() + " : " + student.getOfBegin() + " года");
    }
}
