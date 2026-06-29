package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class DemoSet1 {

    public static void main(String[] args) {

        Set<Employee> s = new LinkedHashSet<>();

        Employee e1 = new Employee(1, "java");
        Employee e2 = new Employee(1, "java");
        Employee e3 = e2;
        Employee e4 = new Employee(1, "java");

        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);

        System.out.println("is e1 equal to e2: " + (e1.equals(e2)));
        System.out.println("is e3 equal to e2: " + (e3.equals(e2)));

        // hashcode
        System.out.println("e1 hashcode: " + e1.hashCode());
        System.out.println("e2 hashcode: " + e2.hashCode());

        // print set
        for (Employee e : s) {
            System.out.println(e);
        }
    }
}

