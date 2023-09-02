package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue <Integer> dishQueue = new ArrayDeque<>();
        for (int i = 0; i < numberOfDishes; i++) {
            dishQueue.add(i+1);
        }
        List<Integer> result = new ArrayList<>();
        while (!dishQueue.isEmpty()) {
            int counter = 1;
            while (counter < everyDishNumberToEat) {
                dishQueue.add(dishQueue.remove());
                counter++;
            }
            result.add(dishQueue.remove());
        }
        return result;
    }

}
