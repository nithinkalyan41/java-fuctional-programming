package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

import static Streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("alex", MALE),
                new Person("king", MALE),
                new Person("queen", FEMALE),
                new Person("jackie", MALE),
                new Person("rose", FEMALE),
                new Person("adam",PREFER_NOT_SAY)
        );
        List <Person> females = new ArrayList<>();
        Function<Person,String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String :: length;
        IntConsumer println = x -> System.out.println(x);
        System.out.println();
       people.stream()
               .map(person -> person.name)
               .mapToInt(length)
               .forEach(println);

       boolean Contains = people.stream()
               .noneMatch(person ->FEMALE.equals(person.gender));
        System.out.println(Contains);
    }
    static class Person{
        private final String name;
        private final Gender gender;
        Person(String name,Gender gender){
            this.name=name;
            this.gender=gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE,PREFER_NOT_SAY
    }
}
