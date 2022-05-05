package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setfio("Пудовкин Алексей Геннадьевич");
        student.setGroup("Java стажер");
        student.setOfBegin(new Date());

        System.out.println(student.getfio() + " начал обучение в группе " + student.getGroup() + " : " + student.getOfBegin() + " года");
    }
}
