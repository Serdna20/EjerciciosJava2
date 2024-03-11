package com.mycompany.classesaccess;

import people.Person;

public class ClassesAccess {

    public static void main(String[] args) {
        OtherClass other = new OtherClass();
        other.sayHello();
        // Ctrl + Space to auto import class
        Person person = new Person("Pepito", "Perez", 15);
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
    }
}
