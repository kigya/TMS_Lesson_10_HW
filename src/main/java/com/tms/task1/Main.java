/**
 * 1. Заполнить коллекцию 5 строками введенными с консоли.
 * В каждой строке заменить "+" на "+++". Вывести коллекцию-результат на экран.
 */

package com.tms.task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Task.fillListWithStrings(arrayList);
        Task.replaceSubstringToString(arrayList, "\\+", "+++");
        System.out.println(arrayList);
    }

}
