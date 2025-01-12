package org.acompletenoobsmoke;

import org.database.FakeDatabase;
import org.database.PeopleDAO;
import org.inputs.ScannerInput;

public class Program {

    PeopleDAO data;
    ScannerInput myInput;
    public Program () {
        this.data = new FakeDatabase();
        this.myInput = new ScannerInput();
    }

    public void addPerson() {
        String firstName = myInput.getString();

    }
}
