package org.example.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleMap {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,4,5);
        List maplist = numbers.stream().map(n-> n*2).collect(Collectors.toList());

        maplist.forEach(m->System.out.println(m));
    }
}
