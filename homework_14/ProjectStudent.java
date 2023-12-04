package com.proftelran.org.homework_14;

public class ProjectStudent {
    String name;
    double rate;
    ClassType type;

    ProjectStudent(String name, double rate, ClassType type) {
        this.name = name;
        this.rate = rate;
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProjectStudent{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", type=" + type +
                '}';
    }
}
