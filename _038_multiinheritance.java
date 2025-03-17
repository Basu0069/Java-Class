/**
 * Multilevel inheritance 
 * 1. wap to create class person(name)
 * class student(ID)
 * class Undergraduate(subject)
 */

import java.util.*;

class Person {
    String name;
    
    Person(String name) {
        this.name = name;
    }
    
    void display1() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int id;
    
    Student(String name, int id) {
        super(name);
        this.id = id;
    }
    
    void display2() {
        display1();
        System.out.println("Student ID: " + id);
    }
}

class Undergraduate extends Student {
    String subject;
    
    Undergraduate(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    
    void display() {
        display2();
        System.out.println("Subject: " + subject);
    }
}

public class _038_multiinheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.next();
        
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter Subject: ");
        String subject = sc.next();
        
        Undergraduate obj = new Undergraduate(name, id, subject);
        System.out.println("\nStudent Details:");
        obj.display();

    }
}