package com.tms.task0add;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Student {

    private int age;
    private double average;
    private String firstName;
    private String lastName;

    public Student() {
    }

    public Student(String firstName, String lastName, int age, double average) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.average = average;
    }

    public static @NotNull Student getMaxAverage(@NotNull List<Student> studentList) {
        ListIterator<Student> iterator = studentList.listIterator();
        Student bestStudent = studentList.get(0);
        while (iterator.hasNext()) {
            if (iterator.next().getAverage() > bestStudent.getAverage()) {
                bestStudent = iterator.previous();
            }
        }
        return bestStudent;
    }

    public static void sortByFullName(@NotNull List<Student> studentsList) {
        Comparator<Student> studentFullNameComparator = new Student.StudentFullNameComparator();
        studentsList.sort(studentFullNameComparator);
        System.out.println("Sorting by full name: ");
        System.out.println(studentsList);
    }

    public static void sortByAge(@NotNull List<Student> studentsList) {
        Comparator<Student> studentAgeComparator = new Student.StudentAgeComparator();
        studentsList.sort(studentAgeComparator);
        System.out.println("Sorting by age:");
        System.out.println(studentsList);
    }

    public static void sortByAverage(@NotNull List<Student> studentsList) {
        Comparator<Student> studentAverageComparator = new Student.StudentAverageComparator();
        studentsList.sort(studentAverageComparator);
        System.out.println("Sorting by average mark:");
        System.out.println(studentsList);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", average=" + average +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.average, average) == 0 && firstName.equals(student.firstName) && lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, average, firstName, lastName);
    }

    public static class StudentFullNameComparator implements Comparator<Student> {
        @Override
        public int compare(@NotNull Student lhs, @NotNull Student rhs) {
            return lhs.getFullName().compareTo(rhs.getFullName());
        }
    }

    public static class StudentAgeComparator implements Comparator<Student> {
        @Override
        public int compare(@NotNull Student lhs, @NotNull Student rhs) {
            return Integer.compare(lhs.getAge(), rhs.getAge());
        }
    }

    public static class StudentAverageComparator implements Comparator<Student> {
        @Override
        public int compare(@NotNull Student lhs, @NotNull Student rhs) {
            return Double.compare(lhs.getAverage(), rhs.getAverage());
        }
    }

}
