package Inheritance.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    private ArrayList data;
    private static Random random;

    static {
        random = new Random();
    }

    public RandomArrayList() {
        this.data = new ArrayList();
    }

    public Object getRandomElement(){
        int index = random.nextInt(this.size());
        Object o = this.get(index);
        this.remove(index);
        return o;
    }
}
