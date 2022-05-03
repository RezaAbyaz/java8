package org.example.java8;

import com.google.common.collect.ImmutableList;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReference2 {
    public static void ThreadStatus(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
/*        Thread t2=new Thread(MethodReference2::ThreadStatus);
        Runnable run = MethodReference2::ThreadStatus;
        t2.start();*/

        List<Student> list = new ArrayList<>();
        list.add(new Student("3","A"));
        list.add(new Student("2","C"));
        list.add(new Student("1","B"));


        for (Student s : list){
            System.out.println(s.getName() + " " + s.getLastName());
        }
        System.out.println( "-----------------------------------------------");
/*        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareToIgnoreCase(o2.getLastName());
            }
        });*/

/*        Collections.sort(list,(a,b) -> a.getName().compareToIgnoreCase(b.getName()));

        for (Student s : list){
            System.out.println(s.getName() + " " + s.getLastName());
        }
        System.out.println("---------------------------------------------");
        Collections.sort(list,(a,b) -> a.getLastName().compareToIgnoreCase(b.getLastName()));*/



        Collections.sort(list,Comparator.comparing(Student::getName).thenComparing(Student::getLastName));
        //Collections.sort(list);

        list.forEach((a) -> System.out.println(a.getName()+" "+a.getLastName()));

        ImmutableList immutableList = ImmutableList.of("Immutable", "Lists", "Java");



        List<String> b = List.of("q","q");

        Predicate<String> isEmpty = (a) -> ( a == null || a.length() <= 0);
        String str = "";
        String str1 = null;
        String str2 = "aa";
        Student st = new Student();
        System.out.println(isEmpty.test(str1));
        System.out.println(isEmpty.test(str1));
        System.out.println(isEmpty.test(str2));


        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");

        System.out.println(joinNames);

        List<Student> studentList = Arrays.asList(new Student("1","2"),
                new Student("3","4"),
                new Student("5","6"),
                new Student("7","8"),
                new Student("8","9"));
        Stream s = studentList.stream().filter((a) -> a.getName().compareToIgnoreCase("6") <= 0);
        List<Student> s2 = (List<Student>) s.collect(Collectors.toList());
        System.out.println(s2.size());


    }
}