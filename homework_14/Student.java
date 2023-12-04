package com.proftelran.org.homework_14;

public class Student {
    String name;
    double rate;
    boolean finished;
    ClassType type;

    Student(String name, double rate, boolean finished) {
        this.name = name;
        this.rate = rate;
        this.finished = finished;
        this.type = null; // Оставить пустым при создании студента
    }
}
