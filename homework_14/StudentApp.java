package com.proftelran.org.homework_14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentApp {
    public static void main(String[] args) {
        // Создаем тестовые данные
        List<Student> frontEndStudents = new ArrayList<>();
        List<Student> backEndStudents = new ArrayList<>();
        List<Student> qaStudents = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            frontEndStudents.add(new FrontEndStudent("FE Student " + i, Math.random() * 10 + 1, true));
            backEndStudents.add(new BackEndStudent("BA Student " + i, Math.random() * 10 + 1, true));
            qaStudents.add(new QAStudent("QA Student " + i, Math.random() * 10 + 1, true));
        }

        // Формируем список-списков
        List<List<Student>> allStudents = new ArrayList<>();
        allStudents.add(frontEndStudents);
        allStudents.add(backEndStudents);
        allStudents.add(qaStudents);

        //  стрим
        List<ProjectStudent> result = allStudents
                .stream()
                .flatMap(List::stream)
                .filter(student -> student.rate > 4.5 && student.finished)
                .map(student -> {
                    ClassType type = null;
                    if (student instanceof FrontEndStudent) {
                        type = ClassType.FE;
                    } else if (student instanceof BackEndStudent) {
                        type = ClassType.BA;
                    } else if (student instanceof QAStudent) {
                        type = ClassType.QA;
                    }
                    return new ProjectStudent(student.name, student.rate, type);
                })
                .peek(projectStudent -> System.out.println("Project Student: " + projectStudent.name +
                        ", Rate: " + projectStudent.rate + ", Type: " + projectStudent.type))
                .collect(Collectors.toList());



        System.out.println("Результат: " + result);
    }
}
