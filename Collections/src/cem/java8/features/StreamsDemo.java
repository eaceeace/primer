package cem.java8.features;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<String> t = new ArrayList<String>();
        t.add("tarinish");
        t.add("sahana");
        t.add("abdul");
        t.add("praveena");
        t.add("nazeer");

        // Demonstrating the use of streams to iterate through the list and print each element
        System.out.println("*******************************");
        t.stream().forEach(i -> System.out.println(i)); // Using a stream and lambda expression to print each element
        System.out.println("*******************************");

        // Using forEach method to print each element directly
        t.forEach(System.out::println);

        // List or display the names of the trainees that contain the letter "n" using traditional for loop
        System.out.println("*******************************");
        for(String i : t){
            if(i.contains("n")){
                System.out.println(i);
            }
        }

        // Using stream with filter method to filter elements that contain the letter "n" and print them
        t.stream().filter(name -> name.contains("n")).forEach(System.out::println);

        // Using stream with filter method to filter elements that start with the letter "t" and print them
        t.stream().filter(name -> name.startsWith("t")).forEach(System.out::println);

        // Using map function to convert each string to uppercase
        System.out.println("*******************************");
        t.stream().map(String::toUpperCase).forEach(System.out::println);

        // Using collect to gather filtered elements into a new list
        System.out.println("*******************************");
        List<String> filteredNames = t.stream()
                .collect(Collectors.toList()); // Collect filtered elements into a new list
        System.out.println(filteredNames);
    }
}
