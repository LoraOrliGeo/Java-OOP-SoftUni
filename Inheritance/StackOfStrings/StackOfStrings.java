package Inheritance.StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item){
        this.data.add(item);
    }

    public String pop(){
        if (!this.isEmpty()) {
            String element = this.data.get(this.data.size() - 1);
            this.data.remove(element);
            return element;
        }
        return null;
    }

    public String peek(){
        if (!this.isEmpty()){
            return this.data.get(this.data.size() - 1);
        }
        return null;
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }
}
