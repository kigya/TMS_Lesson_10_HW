package com.tms.task2;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Task {

    private Task() {
    }

    public static void inputReader(List<String> arrayList) {
        System.out.println("Enter file path\n0 - exit");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String filePath = scanner.nextLine();
            File file = new File(filePath);
            if (filePath.equals("0")) {
                break;
            } else if (!file.exists()) {
                System.out.println("File doesn't exist!");
                continue;
            }
            arrayList.add(filePath);
        }
    }

    public static void writeToRegistry(@NotNull List<String> arrayList, Set<String> hashSet) {
        System.out.println("Reading document numbers...");
        for (String string : arrayList) {
            try {
                File file = new File(string);
                FileReader fr = new FileReader(file);
                try (BufferedReader reader = new BufferedReader(fr)) {
                    String line = reader.readLine();
                    while (line != null) {
                        hashSet.add(line);
                        line = reader.readLine();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeToReport(@NotNull Set<String> hashSet, Map<String, String> hashMap) {
        System.out.println("Writing documents report.txt...");
        for (String item : hashSet) {
            if (isValid(item)) {
                hashMap.put(item, "valid");
            } else {
                hashMap.put(item, returnError(item));
            }
        }
    }

    private static boolean isValid(@NotNull String string) {
        if (string.length() != 15) {
            return false;
        }
        return string.startsWith("docnum") || string.startsWith("contract");
    }

    private static @NotNull String returnError(@NotNull String string) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string.length() != 15) {
            stringBuilder.append("wrong length");
        }
        if (!(string.startsWith("docnum") || string.startsWith("contract"))) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", wrong start sequence");
            } else {
                stringBuilder.append("wrong start sequence");
            }
        }
        return stringBuilder.toString();
    }

    public static void writeReportToFile(@NotNull Map<String, String> hashMap) {
        final String FILEPATH = "C:\\Users\\Lenovo\\Documents\\JAVADev\\TMS_Lesson_10_HW\\src\\main\\java\\com\\tms\\task2\\files\\report.txt";
        try {
            Files.write(Paths.get(FILEPATH),
                    hashMap.entrySet().stream().map(k -> k.getKey() + ": " + k.getValue()).collect(Collectors.toList()),
                    StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.lines(Paths.get(FILEPATH), StandardCharsets.UTF_8).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}