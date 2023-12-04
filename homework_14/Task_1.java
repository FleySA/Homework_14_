package com.proftelran.org.homework_14;

// Дан список List list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
//
//Выполнить сортировку в прямом и обратном алфавитном порядке и удалить дубликаты.
//В качестве результата должно быть два списка прямой и обратный.(два стрима)

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Task_1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        // Прямая сортировка
        List<String> sortedList = list.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Прямая сортировка: " + sortedList);

        // Обратная сортировка
        List<String> reverseSortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Обратная сортировка: " + reverseSortedList);
    }
}
