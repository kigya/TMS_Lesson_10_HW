package com.tms.task3;

import org.junit.Test;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

public class TestPerson {

    @Test
    public void testImmutable() {
        assertImmutable(Person.class);
    }
}
