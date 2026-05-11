package de.codedok;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class Test {

    private final String test;

    public Test(String test) {
        this.test = ObjectAssertions.with("test", test).isNotNull().getValue();
    }

    public String getTest() {
        return test;
    }
}
