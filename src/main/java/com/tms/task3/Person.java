/**
 * 3. Создать неизменяемый(immutable) класс
 */

package com.tms.task3;

import com.google.common.collect.ImmutableMap;

public final class Person {

    private final String firstName;
    private final String lastName;
    private final String passportId;
    private final String address;
    private final int age;
    private final ImmutableMap<Integer, String> travelList;

    public Person(String firstName, String lastName, String passportId, String address, int age,
                  ImmutableMap<Integer, String> travelList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.address = address;
        this.age = age;
        this.travelList = travelList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public ImmutableMap<Integer, String> getTravelList() {
        return travelList;
    }
}
