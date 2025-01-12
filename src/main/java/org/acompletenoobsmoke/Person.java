package org.acompletenoobsmoke;

public class Person {

    private static int idCounter;

    private int ID;
    private String firstName;
    private String lastName;
    private String occupation;
    private int age;

    public Person(String firstName, String lastName, int age){
        this.ID = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = "Unemployed";
    }

    public Person(String firstName, String lastName, String occupation, int age){
        this.ID = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public Person() {
        this.ID = idCounter++;
    }

    public int getID() {
        return ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getOccupation(){
        return occupation;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID#=" + ID + "\n" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", age=" + age +
                '}';
    }
}
