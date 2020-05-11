import java.lang.String;

public class Person {

    private String name;
    private String surename;
    private int age;

    public Person(String name, String surename, int age) {
        this.name = name;
        this.surename = surename;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person: " + surename + ", " + name + ". Age: " + age;
    }

    public void printPerson() {
        System.out.println(this.toString());
    }
}