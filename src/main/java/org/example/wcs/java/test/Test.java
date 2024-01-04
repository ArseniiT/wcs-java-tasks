package org.example.wcs.java.test;

import java.util.Arrays;

// This package and class are designed for testing other students' code.
public class Test {
    public static void main(String[] args) {
        String[] actors1 = { "actor11", "actor12", "actor13" };
        String[] actors2 = { "actor21", "actor22", "actor23" };
        String[] actors3 = { "actor31", "actor32", "actor33" };
        String[][] films = {
                { "film1", "film2", "film3" },
                actors1, actors2, actors3
        };
        for (int i = 0; i < films[0].length; i++) {
            System.out.println(films[0][i] + "trois acteurs principaux :");
            System.out.println(Arrays.toString(films[i + 1]));
        }
    }
}
