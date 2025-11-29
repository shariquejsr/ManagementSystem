package GTPRac.Grat.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employess {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private String role;
    private int age;
    private double salary;



    // ⭐ REQUIRED: No-argument constructor
    public Employess() {
    }

    // ⭐ OPTIONAL: All-args constructor
    public Employess(String name, String role, int age, double salary) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.salary = salary;
    }

    // ⭐ REQUIRED: Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
