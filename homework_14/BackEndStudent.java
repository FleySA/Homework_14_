package com.proftelran.org.homework_14;

public class BackEndStudent extends Student {
    BackEndStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
        this.type = ClassType.BA;
    }
}

