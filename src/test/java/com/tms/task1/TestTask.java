package com.tms.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TestTask {

    @org.junit.Test
    public void testArrayListReplacing() {
        ArrayList<String> arrayList = new ArrayList<>
                (Arrays.asList("+", "string+", "qwerty", "+java ++", "hello"));
        ArrayList<String> testList = (ArrayList<String>) arrayList.clone();
        Task.replaceSubstringToString(arrayList, "\\+", "+++");
        testList.forEach(string -> string.replace("\\+", "+++"));
        assertEquals(testList, arrayList);
    }

    @org.junit.Test
    public void testLinkedListReplacing() {
        LinkedList<String> linkedList = new LinkedList<>
                (Arrays.asList("+", "string+", "qwerty", "+java ++", "hello"));
        LinkedList<String> testList = (LinkedList<String>) linkedList.clone();
        Task.replaceSubstringToString(linkedList, "\\+", "+++");
        testList.forEach(string -> string.replace("\\+", "+++"));
        assertEquals(testList, linkedList);
    }
}
