package org.example.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("mama","subha","subhashree","mummy");

        List namesstartswiths = names.stream().filter(name ->name.startsWith("s")).collect(Collectors.toList());
        List namesstartswithm = names.stream().filter(name ->name.startsWith("m")).collect(Collectors.toList());

        namesstartswiths.forEach(name -> System.out.println(name));
        namesstartswithm.forEach(name -> System.out.println(name));

    }
}
