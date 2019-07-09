package Inheritance.StackOfStrings;

public class Main {
    public static void main(String[] args) {

        StackOfStrings stackOfStrings = new StackOfStrings();

        stackOfStrings.push("Hello");
        stackOfStrings.push("Lori");
        stackOfStrings.push("Didi");
        stackOfStrings.push("Ani");

        System.out.println(stackOfStrings.peek());
        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.pop());

    }
}
