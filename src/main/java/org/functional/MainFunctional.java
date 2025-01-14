package org.functional;

import java.util.List;
import java.util.stream.Collectors;

public class MainFunctional {

    public enum Gender {
        MALE, FEMALE
    }

    public static void main(String[] args) {
        List<SimplePerson> personList = List.of(
                new SimplePerson("Osaretin", "Mechanic", Gender.MALE),
                new SimplePerson("Victoria", "Assistance Specialist", Gender.FEMALE),
                new SimplePerson("Osato", "Government", Gender.FEMALE),
                new SimplePerson("Boye", "Developer", Gender.MALE),
                new SimplePerson("Ade", "Developer", Gender.MALE),
                new SimplePerson("Summer", "Dentist Assistance", Gender.FEMALE)
        );

        personList.stream()
                .filter(simplePerson -> Gender.FEMALE.equals(simplePerson.gender))
                .toList()
                .forEach(System.out::println);
    }

    static class SimplePerson {
        private String name;
        private String occuputation;

        private Gender gender;

        public SimplePerson (String name, String occupation, Gender gender) {
            this.name = name;
            this.occuputation = occupation;
            this.gender = gender;
        }

        public String toString(){
            return "Name: " + name + "\n" +
                   "Occupation: " + occuputation + "\n" +
                    "Gender: " + gender + "\n\n";
        }
    }
}
