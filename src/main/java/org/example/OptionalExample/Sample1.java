package org.example.OptionalExample;

import java.util.Optional;

public class Sample1 {
    public static void main(String[] args) {

        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // check for value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");

      //  String name = "baeldung";
       // Optional<String> opt = Optional.of(name);
       // System.out.println(opt.isPresent());
    }
}
