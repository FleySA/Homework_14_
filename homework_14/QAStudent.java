package com.proftelran.org.homework_14;

public class QAStudent extends  Student{
    QAStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
        this.type = ClassType.QA;
    }
}
