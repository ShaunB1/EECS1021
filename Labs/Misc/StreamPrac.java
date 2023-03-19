package Misc;

import java.util.*;
import java.util.stream.Collectors;

import static Misc.Gender.FEMALE;

public class StreamPrac {
    public static void main(String[] args) {
        List<Person> people = getPeople();

//        List<Person> females = new ArrayList<>();

//        for(Person person : people) {
//            if(person.getGender().equals(Gender.FEMALE)) {
//                females.add(person);
//            }
//        }

//        females.forEach(System.out::println);

        // Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        // Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());

//        sorted.forEach(System.out::println);

        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 5);
//        System.out.println(allMatch);

        // None Match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));
//        System.out.println(noneMatch);

        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge));
//                .ifPresent(System.out::println);

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge));
//                .ifPresent(System.out::println);

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

//        groupByGender.forEach((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//        });

        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemaleAge.ifPresent(name -> System.out.println(name));
    }

    public static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, FEMALE),
                new Person("Helen White", 57, FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, FEMALE),
                new Person("Zelda Brown", 120, FEMALE)
        );
    }
}
