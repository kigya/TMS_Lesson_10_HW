package com.tms.task1;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Scanner;

public final class Task {

    private Task(){
    }

    static void fillListWithStrings(@NotNull List<String> list) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
    }

    static void replaceSubstringToString(@NotNull List<String> list, String lhs, String rhs) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(lhs.replace("\\\\", ""))) {
                list.set(i, list.get(i).replace(lhs, rhs));
            }
        }
    }
}

