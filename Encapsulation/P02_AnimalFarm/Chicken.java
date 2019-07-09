package Encapsulation.P02_AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.isEmpty() || name.equals(" ")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        } else {
            this.age = age;
        }
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (12 <= this.getAge() && this.getAge() <= 15){
            return 0.75;
        } else if (6 <= this.getAge() && this.getAge() <= 11 ){
            return 1.0;
        } else {
            return 2.0;
        }
    }

    @Override
    public String toString() {
        return String.format("Encapsulation.P02_AnimalFarm.Chicken %s (age %d) can produce %.2f eggs per day.",
                this.getName(), this.getAge(), this.productPerDay());
    }
}