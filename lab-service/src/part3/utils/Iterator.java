package part3.utils;

import java.util.function.Consumer;

public interface Iterator<E> extends java.util.Iterator<E> {
    boolean hasNext();
    E next();
    void remove();

    @Override
    default void forEachRemaining(Consumer<? super E> action) {
        java.util.Iterator.super.forEachRemaining(action);
    }
}
