package com.ferroddev;

import com.google.common.collect.ImmutableList;

import java.util.Iterator;
import java.util.List;

public class GuavaUtil {

    public static List<Integer> iterableToList(final Iterator<Integer> iterator) {
        return ImmutableList.copyOf(iterator);
    }

}
