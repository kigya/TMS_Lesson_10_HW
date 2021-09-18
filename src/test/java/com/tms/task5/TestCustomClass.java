package com.tms.task5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCustomClass {

    @Test
    public void testEmptyList() {
        CustomList<Integer> integerCustomList = new CustomList<>();
        CustomList<String> stringCustomList = new CustomList<>();
        CustomList<Calendar> calendarCustomList = new CustomList<>();
        Assert.assertEquals("CustomList: [null]", integerCustomList.toString());
        Assert.assertEquals("CustomList: [null]", stringCustomList.toString());
        Assert.assertEquals("CustomList: [null]", calendarCustomList.toString());
        Assert.assertEquals(1, integerCustomList.size());
        Assert.assertEquals(1, stringCustomList.size());
        Assert.assertEquals(1, calendarCustomList.size());
    }

    @Test
    public void testEmptyListWithClear() {
        CustomList<Integer> integerCustomList = new CustomList<>();
        integerCustomList.add(10);
        CustomList<String> stringCustomList = new CustomList<>();
        stringCustomList.add("Java");
        CustomList<Calendar> calendarCustomList = new CustomList<>();
        stringCustomList.add(new GregorianCalendar(2013,0,31));
        integerCustomList.clear();
        stringCustomList.clear();
        calendarCustomList.clear();
        Assert.assertEquals("CustomList: []", integerCustomList.toString());
        Assert.assertEquals("CustomList: []", stringCustomList.toString());
        Assert.assertEquals("CustomList: []", calendarCustomList.toString());
    }

    @Test
    public void testAddElementsToList() {
        CustomList<Integer> integerCustomList = new CustomList<>();
        CustomList<String> stringCustomList = new CustomList<>();
        CustomList<Calendar> calendarCustomList = new CustomList<>();
        Assert.assertTrue(integerCustomList.add(10));
        Assert.assertTrue(stringCustomList.add("Java"));
        Assert.assertTrue(calendarCustomList.add(new GregorianCalendar(2013,0,31)));
    }

    @Test
    public void testCreateListWithCertainSize() {
        CustomList<Integer> integerCustomList = new CustomList<>(7);
        CustomList<String> stringCustomList = new CustomList<>(5);
        CustomList<Calendar> calendarCustomList = new CustomList<>(10);
        Assert.assertEquals(7, integerCustomList.size());
        Assert.assertEquals(5, stringCustomList.size());
        Assert.assertEquals(10, calendarCustomList.size());
    }

    @Test
    public void testListGetMethod() {
        CustomList<Integer> integerCustomList = new CustomList<>();
        CustomList<String> stringCustomList = new CustomList<>();
        CustomList<Calendar> calendarCustomList = new CustomList<>();
        integerCustomList.add(10);
        integerCustomList.add(11);
        integerCustomList.add(12);
        integerCustomList.add(13);
        stringCustomList.add("Java");
        stringCustomList.add("Kotlin");
        stringCustomList.add("Scala");
        Assert.assertEquals("11", integerCustomList.get(1).toString());
        Assert.assertEquals("Kotlin", stringCustomList.get(1));
        try {
            calendarCustomList.get(0);
            Assert.fail("Error!");
        } catch (IndexOutOfBoundsException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    @Test
    public void testListSetMethod() {
        CustomList<Integer> integerCustomList = new CustomList<>();
        CustomList<String> stringCustomList = new CustomList<>();
        CustomList<Calendar> calendarCustomList = new CustomList<>();
        integerCustomList.add(10);
        integerCustomList.add(11);
        integerCustomList.add(12);
        integerCustomList.add(13);
        stringCustomList.add("Java");
        stringCustomList.add("Kotlin");
        stringCustomList.add("Scala");

        integerCustomList.set(0, 666);
        stringCustomList.set(2, "Groovy");
        Assert.assertEquals("666", integerCustomList.get(0).toString());
        Assert.assertEquals("Groovy", stringCustomList.get(2));
        try {
            calendarCustomList.set(10, new GregorianCalendar(2005, 0, 12));
            Assert.fail("Error!");
        } catch (IndexOutOfBoundsException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    @Test
    public void testListRemoveMethod() {
        CustomList<Integer> integerCustomList = new CustomList<>();
        CustomList<String> stringCustomList = new CustomList<>();
        CustomList<Calendar> calendarCustomList = new CustomList<>();
        integerCustomList.add(10);
        integerCustomList.add(11);
        integerCustomList.add(12);
        integerCustomList.add(13);
        stringCustomList.add("Java");
        stringCustomList.add("Kotlin");
        stringCustomList.add("Scala");

        ArrayList<Integer> integerArrayList = new ArrayList<>(integerCustomList);
        ArrayList<String> stringArrayList = new ArrayList<>(stringCustomList);
        integerCustomList.remove(1);
        integerArrayList.remove(1);
        stringCustomList.remove(1);
        stringArrayList.remove(1);

        Assert.assertArrayEquals(integerArrayList.toArray(), integerCustomList.toArray());

        try {
            calendarCustomList.remove(10);
            Assert.fail("Error!");
        } catch (IndexOutOfBoundsException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    @Test
    public void testListContainsMethod() {
        CustomList<Integer> integerCustomList = new CustomList<>();
        CustomList<String> stringCustomList = new CustomList<>();
        integerCustomList.add(10);
        integerCustomList.add(11);
        integerCustomList.add(12);
        integerCustomList.add(13);
        stringCustomList.add("Java");
        stringCustomList.add("Kotlin");
        stringCustomList.add("Scala");
        Assert.assertTrue(integerCustomList.contains(11));
        Assert.assertTrue(stringCustomList.contains("Java"));
        Assert.assertFalse(integerCustomList.contains(55));
    }

}
