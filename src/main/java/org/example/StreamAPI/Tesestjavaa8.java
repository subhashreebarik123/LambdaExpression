package org.example.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tesestjavaa8 {


    public static void main(String[] args){
        List<Integer> list =  Stream.iterate(1, element->element+1).filter(element->element%5==0).limit(5).collect(Collectors.toList());
                //.limit(5)
                //.forEach(System.out::println);


        list.forEach(n->System.out.println(n));
    }
}
