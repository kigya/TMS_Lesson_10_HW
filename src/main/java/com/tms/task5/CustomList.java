package com.tms.task5;

import org.apache.commons.lang3.ArrayUtils;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Objects;

public class CustomList<T> extends AbstractList<T> implements Serializable {

    private static final int DEFAULT_CAPACITY = 1;
    private transient T[] array;
    private int size = 0;

    public CustomList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public CustomList(int size) {
        array = (T[]) new Object[size];
    }

    public CustomList(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index doesn't exist");
        }
        return array[index];
    }

    public int size() {
        return array.length;
    }

    private void ensureCapacity() {
        int newSize = array.length + 1;
        array = Arrays.copyOf(array, newSize);
    }

    @Override
    public T remove(int index) {
        array = ArrayUtils.remove(array, index);
        size--;
        return (T) array;
    }


    @Override
    public T set(int index, Object element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index doesn't exist");
        }
        T oldValue = array[index];
        array[index] = (T) element;
        return oldValue;
    }

    @Override
    public Object[] toArray() {
        return array.clone();
    }

    @Override
    public boolean add(Object object) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = (T) object;
        return true;
    }

    @Override
    public String toString() {
        return "CustomList: " + Arrays.toString(array);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomList<?> that = (CustomList<?>) o;
        return size == that.size && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public void clear() {
        array = Arrays.copyOf(array, 0);
        size = 0;
    }

    @Override
    public boolean contains(Object o) {
        return ArrayUtils.contains(array, o);
    }

}
