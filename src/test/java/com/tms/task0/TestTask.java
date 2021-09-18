package com.tms.task0;

import org.jetbrains.annotations.NotNull;
import org.junit.Assert;

import java.util.*;

public class TestTask {

    @org.junit.Test
    public void testArrayListFilling() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Task.fillCollectionByRandomNumbers(arrayList);
        System.out.println("Array filling: " + arrayList);
        Assert.assertEquals(10, arrayList.size());
    }

    @org.junit.Test
    public void testLinkedListFilling() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Task.fillCollectionByRandomNumbers(linkedList);
        System.out.println("Array filling: " + linkedList);
        Assert.assertEquals(10, linkedList.size());
    }

    @org.junit.Test
    public void testArrayListFindingMax() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Task.fillCollectionByRandomNumbers(arrayList);
        System.out.println("ArrayList to check max values: ".concat(String.valueOf(arrayList)));
        Assert.assertEquals(Collections.max(arrayList), Task.findFirstMaxElement(arrayList).get(1));
        Collections.sort(arrayList);
        Assert.assertEquals(arrayList.get(arrayList.size() - 2), Task.findFirstMaxElement(arrayList).get(2));
    }

    @org.junit.Test
    public void testLinkedListFindingMax() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Task.fillCollectionByRandomNumbers(linkedList);
        System.out.println("LinkedList to check max values: ".concat(String.valueOf(linkedList)));
        Assert.assertEquals(Collections.max(linkedList), Task.findFirstMaxElement(linkedList).get(1));
        Collections.sort(linkedList);
        Assert.assertEquals(linkedList.get(linkedList.size() - 2), Task.findFirstMaxElement(linkedList).get(2));
    }

    /**
     * Check list as interface (cannot add elements)
     */
    @org.junit.Test
    public void testListFilling() {
        List<Integer> list = new List<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NotNull
            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @NotNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NotNull
            @Override
            public <T> T[] toArray(@NotNull T[] ts) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NotNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(@NotNull Collection<? extends Integer> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, @NotNull Collection<? extends Integer> collection) {
                return false;
            }

            @Override
            public boolean removeAll(@NotNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(@NotNull Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int i) {
                return null;
            }

            @Override
            public Integer set(int i, Integer integer) {
                return null;
            }

            @Override
            public void add(int i, Integer integer) {

            }

            @Override
            public Integer remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NotNull
            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @NotNull
            @Override
            public ListIterator<Integer> listIterator(int i) {
                return null;
            }

            @NotNull
            @Override
            public List<Integer> subList(int i, int i1) {
                return null;
            }
        };
        Task.fillCollectionByRandomNumbers(list);
        System.out.println(list);
        Assert.assertEquals(0, list.size());
    }

}
