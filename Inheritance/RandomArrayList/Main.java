package Inheritance.RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList randomArrayList = new RandomArrayList();

        randomArrayList.add("ASD");
        randomArrayList.add(15.236);
        randomArrayList.add('b');

        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
    }
}
