package com.ferroddev;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class StreamsUtil {

    public static List<Integer> iteratorToList(final Iterator<Integer> iterator) {
        return StreamSupport
                .stream(iteratorToIterable(iterator).spliterator(), false)
                .collect(Collectors.toList());
    }

    public static <T> Iterable<T> iteratorToIterable(final Iterator<T> iterator) {
        return () -> iterator;
    }

}

