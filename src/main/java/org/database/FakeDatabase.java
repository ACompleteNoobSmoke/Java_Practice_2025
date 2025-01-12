package org.database;

import org.acompletenoobsmoke.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FakeDatabase implements PeopleDAO {

    private final List<Person> peopleList;

    private boolean isEmpty() {
        return peopleList.isEmpty();
    }

    public FakeDatabase() {
        peopleList = new ArrayList<>();
    }

    @Override
    public void savePerson(Person newPerson) {
        peopleList.add(newPerson);
    }

    @Override
    public Person getPersonByID(int id) {
        if (isEmpty()) return null;
        return peopleList.stream()
                .filter(person -> person.getAge() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Person> getPersonByName(String firstName, String lastName) {
        return (isEmpty()) ? null :
        peopleList.stream()
                .filter(person -> person.getFirstName().equals(firstName) && person.getLastName().equals(lastName))
                .collect(Collectors.toList());
    }

    @Override
    public boolean checkIfIDExist(int id) {
        return !isEmpty() && peopleList.stream().anyMatch(person -> person.getID() == id);
    }

    @Override
    public boolean removePerson(int id) {
        return !isEmpty() && peopleList.remove(getPersonByID(id));
    }

    public List<Person> getPeopleList () {
        return peopleList;
    }
}
