package com.tms.task0;

import org.jetbrains.annotations.NotNull;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.*;

public final class Task {

    private Task() {
    }

    static @NotNull Map<Integer, Integer> findFirstMaxElement(List<Integer> list) {
        HashMap<Integer, Integer> maxElements = new HashMap<>();
        Collections.sort(list);
        maxElements.put(1, list.remove(list.size() - 1));
        maxElements.put(2, list.remove(list.size() - 1));
        return maxElements;
    }

    public static void fillCollectionByRandomNumbers(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            addRandomNumberToCollection(list);
        }
    }

    private static void addRandomNumberToCollection(@NotNull List<Integer> list) {
        Random random = null;
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        list.add(Objects.requireNonNull(random).nextInt(96) + 2);
    }

}
