package LambdaThree;

import java.util.*;
import java.util.stream.Collectors;

public class MainLambdaThree {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Travolta", 30));
        people.add(new Person("Ann", "Kain", 40));
        people.add(new Person("Ana", "Smith", 50));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printAll(people);

        printAllPeopleBeginningWithT(people);

        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("K");
            }
        });

        //Lambda approach:
        Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));
        printAll(people);

        // Or better:
        Collections.sort(people, Comparator.comparing(Person::getFirstName));
        printAll(people);

        //Print conditionally
        printConditionally(people, p -> p.getLastName().startsWith("T"));

        //Print all with lambda
        printConditionally(people, p -> true);
    }

    private static void printAll(List<Person> people) {
        for (Person p : people
                ) {
            System.out.println(p.getLastName());
        }
    }

    private static void printAllPeopleBeginningWithT(List<Person> people) {
        for (Person p : people
                ) {
            if (p.getLastName().startsWith("T")) {
                System.out.println(p);
            }
        }
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people
                ) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}
