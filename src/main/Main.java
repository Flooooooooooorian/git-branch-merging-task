package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<String> nameSpelling = new ArrayList<>();
            String name = "Jakob Schneider";
            nameSpelling = Arrays.stream(name.split("")).toList();
            nameSpelling.stream().forEach(System.out::println);

        }
    }

