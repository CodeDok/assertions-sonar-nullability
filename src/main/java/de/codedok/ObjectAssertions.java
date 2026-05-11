package de.codedok;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class ObjectAssertions<T> {

    private final String propertyName;
    private final @Nullable T value;

    private ObjectAssertions(String propertyName, @Nullable T value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    public static <T> ObjectAssertions<T> with(String propertyName, @Nullable T value) {
        return new ObjectAssertions<>(propertyName, value);
    }

    public ObjectAssertions<T> isNotNull() {
        if (value == null) {
            throw new AssertionError("Value is null");
        }
        return this;
    }

    public @NonNull T isNotNullReturn() {
        if (value == null) {
            throw new AssertionError("Value is null for " + propertyName);
        }
        return value;
    }

    public @NonNull T getValue() {
        isNotNull();
        assert value != null;
        return value;
    }
}
