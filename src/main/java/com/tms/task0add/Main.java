/**
 * 0. Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу, используя компараторы.
 */

package com.tms.task0add;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 17, 8.5));
        students.add(new Student("Sam", "Smith", 18, 9.1));
        students.add(new Student("Roy", "Stewart", 17, 8.9));
        students.add(new Student("Melissa", "White", 19, 8.2));
        students.add(new Student("Chris", "Morris", 20, 5.4));

        System.out.print("Best student: ");
        System.out.print(Student.getMaxAverage(students));
        System.out.println("\n");

        Student.sortByFullName(students);
        Student.sortByAverage(students);
        Student.sortByAge(students);
    }
}
