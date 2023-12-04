package com.proftelran.org.homework_14;

public class FrontEndStudent extends Student{
    FrontEndStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
        this.type = ClassType.FE;
    }
}
