package com.company.Lab22x;

public class Lab224 {
    public static void main(String[] args) {
        Person personAlice = new Person("Alice", "McGee", "female", 98);
        Person personBob = new Person("Bob");
        Person personCharlie = new Person("Charlie", "Somebody");

        System.out.println(String.format("%s %s + %s %s = %s %s",personAlice.getGender(),personAlice.getFirstName(),
                                                                personBob.getGender(), personBob.getFirstName(),
                                                                personCharlie.getGender(), personCharlie.getFirstName()));

    }
}

class Person{
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int phoneNumber;

    private final static String DEFAULT_LAST_NAME = "Nobody";
    private final static String DEFAULT_GENDER = "Male";
    private final static int DEFAULT_AGE = 18;
    private final static int DEFAULT_PHONE = 123456789;

    public Person(String firstName, String lastName, String gender, int age, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Person(String firstName, String lastName, String gender, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = DEFAULT_PHONE;
    }

    public Person(String firstName, String lastName, String gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = DEFAULT_AGE;
        this.phoneNumber = DEFAULT_PHONE;
    }

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = DEFAULT_GENDER;
        this.age = DEFAULT_AGE;
        this.phoneNumber = DEFAULT_PHONE;
    }

    public Person(String firstName) {

        this.firstName = firstName;
        this.lastName = DEFAULT_LAST_NAME;
        this.gender = DEFAULT_GENDER;
        this.age = DEFAULT_AGE;
        this.phoneNumber = DEFAULT_PHONE;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
