package org.example.ForEachExample;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();

        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Footbal");
        gamesList.add("Ludo");
        gamesList.add("BasketBall");
        System.out.println("--------Iterating by passing Method Reference---------");
        gamesList.forEach(System.out::println);
    }
}
