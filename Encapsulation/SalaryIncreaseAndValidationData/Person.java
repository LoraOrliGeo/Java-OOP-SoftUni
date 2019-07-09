package Encapsulation.SalaryIncreaseAndValidationData;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 3) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 460) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
    }

    public void increaseSalary(double percent) {
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() + this.getSalary() * percent / 200.0);
        } else {
            this.setSalary(this.getSalary() + this.getSalary() * percent / 100.0);
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.0######");
        return String.format("%s %s gets %s leva", this.getFirstName(), this.getLastName(), df.format(this.getSalary()));
    }
}