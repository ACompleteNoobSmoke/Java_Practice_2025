package org.database;

import org.acompletenoobsmoke.Person;

import java.util.List;

public interface PeopleDAO {
    void savePerson(Person newPerson);
    Person getPersonByID(int id);
    List<Person> getPersonByName(String firstName, String lastName);

    boolean checkIfIDExist (int id);

    boolean removePerson(int id);
}
