/**
 * 0. Заполнить коллекцию 10 рандомными целыми числами в промежутке от 2 до 98.
 * Найти два максимальных элемента и вывести их на экран.
 */

package com.tms.task0;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Task.fillCollectionByRandomNumbers(arrayList);
        System.out.println(arrayList);
        System.out.println("Two max elements: " + Task.findFirstMaxElement(arrayList));
    }
}
