package org.example.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        List<String> names = Arrays.asList("ram", "hari");

        List namesmorethanfour = names.stream().filter(name-> name.length()>3).collect(Collectors.toList());
        List namesstartswithr = names.stream().filter(name-> name.startsWith("r")).collect(Collectors.toList());

       List evennumbers =  numbers.stream().filter(number-> number>2).collect(Collectors.toList());


       evennumbers.forEach(number-> System.out.println(number));

        namesstartswithr.forEach(n-> System.out.println(n));
    }
}
