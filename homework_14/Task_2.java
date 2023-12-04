package com.proftelran.org.homework_14;

import java.util.Arrays;
import java.util.List;

//      Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
public class Task_2 {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("a1", "b5", "a2", "b4");

        // Найти самый маленький элемент
        String minElement = elements.stream()
                .min(String::compareTo)
                .orElse(null);

        System.out.println("Самый маленький элемент: " + minElement);
    }
}
