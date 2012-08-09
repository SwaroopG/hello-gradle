package com.poorjar.gradle.hello;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * HelloGradle class.
 */
public class HelloGradle {
    public static String sayHelloWorld() {
        System.out.println("Hello World!");
        return "Hello World!";
    }

    public String getAllNames(List<String> names) {
        String addedNames = "";
        for(String name : ImmutableList.copyOf(names)) {
            if(addedNames.isEmpty())
                addedNames = addedNames + name;
            else
                addedNames = addedNames + "+" + name;
        }
        return addedNames;
    }
}
