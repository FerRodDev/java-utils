package com.ferroddev.guava;

import com.google.common.collect.ImmutableList;

import java.util.Iterator;
import java.util.List;

public class IteratorUtil {

    public static List<Integer> toList(final Iterator<Integer> iterator) {
        return ImmutableList.copyOf(iterator);
    }

}
