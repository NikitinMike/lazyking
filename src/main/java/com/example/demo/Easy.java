package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

public class Easy {

    void main() {
        {
            Set<String> set = new HashSet<>();
            set.add("Mama");
            set.add("Mila");
            set.add("Ramu");

            //получение итератора для множества
            //проверка, есть ли ещё элементы
            //получение текущего элемента и переход на следующий
            set.forEach(out::println);

            //все элементы хранятся в парах
            Map<String, String> map = new HashMap<>();
            map.put("first", "Mama");
            map.put("second", "Mila");
            map.put("third", "Ramu");

            //получение «пары» элементов
           //ключ //значение
            map.forEach((key, value) -> out.printf("%s:%s%n", key, value));

//            Map<String, String> map = new HashMap<>();
            map.put("first", "Mama");
            map.put("second", "Mila");
            map.put("third", "Ramu");

            //ключ значение
            map.forEach((key, value) -> out.printf("%s:%s%n", key, value));
        }
    }
}
