package com.example.springboot_demo.util;

import com.example.springboot_demo.entity.Employee;
import java.util.Arrays;
import java.util.List;

public class Java8Features {

    public static void main (String[] args) {
        //System.out.println("Hello World");

        int[] arr = {4, 2, 5, 1, 3};
        List<Integer> list = Arrays.asList(4, 2, 5, 1, 3);

        //Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //list.stream().max((o1, o2) -> o1 - o2).ifPresent(System.out::println);
        //list.stream().sorted().map(i -> i * 2).forEach(System.out::println);

        /*List<Integer> list1 = Arrays.asList(3, 2, 3, 1, 2, 5, 3, 4, 5);
        list1.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().forEach(System.out::println);
*/
        String str = "shashikant";
        //str.chars().mapToObj(i -> (char)i).sorted().forEach(System.out::println);
        //str.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(c -> c, Collectors.counting())).forEach((k, v) -> System.out.println(k + " " + v));

        /*String str1 = "hello hi how are you hello hi";
        Arrays.stream(str1.split(" ")).collect(Collectors.groupingBy(s -> s, Collectors.counting())).
                                                entrySet().forEach(System.out::println);
                                                //entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);*/


        List<Employee> employees = List.of(
                new Employee(1, "John", 30, 70000),
                new Employee(2, "Mike", 25, 60000),
                new Employee(3, "Shashi", 35, 80000),
                new Employee(4, "Rahul", 40, 90000)
        );

        //employees.stream().filter(e -> e.getAge() > 25).forEach(System.out::println);
        /*employees.stream().map(e -> {
                                if(e.getAge() > 25) {
                                    e.setSalary(e.getSalary() + 1000);
                                }
                                return e;
                            }).forEach(System.out::println);*/




    }
}
