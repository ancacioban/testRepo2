package com.example.springboot;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EqualityTest {

    public void test() {

        Student s1 = new Student("Paul", 24);
        Student s2 = new Student("Paul", 24);
        //s2 = s1;

        //System.out.println(s1.equals(s2));

        Student s = new Student("Paul", 24);
        Student q = new Student("Paul", 24);
        //Student2 ss = new Student2("Male");
        Student2 sss = new Student2("Paul", 24, "Male");
        //s = sss;

        System.out.println(s.equals(q));
        System.out.println(s.hashCode());
        System.out.println(q.hashCode());
    }

    public void testMap() {
        Map<Integer, String> map = new HashMap<>(16, 2);
        map.put(1, "Anca");
        map.put(2, "Ioana");
        map.put(3, "Crina");

        //System.out.println(map);

        //Integer.valueOf(2);

        map.put(3, "Crina");

        map.put(5, null);
        map.put(4, null);
        map.put(null, "Vasile");
        map.put(null, "Ioan");

        String a = "Hey";
        String b = "Hey";

        //System.out.println(a.hashCode());
        //System.out.println(b.hashCode());

        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
