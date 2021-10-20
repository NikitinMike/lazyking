package com.example.demo;

import static java.lang.System.out;

import java.util.*;
import java.util.stream.Collectors;

//@SpringBootApplication
public class DemoApplication {

    private static final List<String> pollResults = List.of(
            "служанка Аня", "управляющий Семен Семеныч: крестьянин Федя, доярка Нюра",
            "дворянин Кузькин: управляющий Семен Семеныч, жена Кузькина, экономка Лидия Федоровна",
            "экономка Лидия Федоровна: дворник Гена, служанка Аня",
            "доярка Нюра", "кот Василий: человеческая особь Катя",
            "дворник Гена: посыльный Тошка", "киллер Гена", "зажиточный холоп: крестьянка Таня",
            "секретарь короля: зажиточный холоп, шпион Т",
            "шпион Т: кучер Д", "посыльный Тошка: кот Василий",
            "аристократ Клаус", "просветленный Антон",
            "репка: дедка", "дедка: бабка", "бабка: внучка", "внучка: жучка",
            "жучка: кошка", "кошка: мышка"
    );

    public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
        List<String> list = List.of(
//        List.of(
//            Set.of("ddd",
//                Set.of("ddd", "gdshdsh", "hdhdh")
//                , "hdhdh"),
//            "gdshdsh", "hdhdh"),
                "aaa", "bbb", "ccc"
        );
//    Stack<List<String>> queue = new Stack<>();
        Stack<String> queue = new Stack<>();
//    queue.addAll(Collections.singleton((pollResults)));
        queue.addAll(pollResults);
        queue.forEach(out::println);
        out.println("=====================================");
        while (!queue.isEmpty()) out.println(queue.pop());

//    (new Random()).ints().limit(10).forEach(System.out::println);
//    (new Random()).ints(10).map(i->i%10+10).forEach(s-> out.printf("%d ",s));

        (new Random()).ints(99, 3, 9)
                .mapToObj(DemoApplication::randomString)
                .map(s -> s + " ")
                .forEach(out::print);

//    out.println(randomString(8));

//    queue.forEach(pop);
//    queue.pop()

    }
//  static String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//      + "abcdefghijklmnopqrstuvwxyz"
//      + "0123456789";

    static String sogl = "бвгджзйклмнпрстфхцчшщьъ";
    static String glas = "аеёиоуыэюя";
    static String chars = glas + sogl;

    //  static String chars = "абвгдеёжзийклмно9прстуфхцчшщьъыэюя"
//      + "abcdefghijklmnopqrstuvwxyz"
//      + "0123456789"
//    ;
    static String randomString(int length) {
        return new Random().ints(length, 0, chars.length())
                .mapToObj(i -> "" + chars.charAt(i))
                .collect(Collectors.joining());
    }
}
