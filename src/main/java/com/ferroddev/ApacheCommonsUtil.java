package com.ferroddev;

import org.apache.commons.collections4.IteratorUtils;

import java.util.Iterator;
import java.util.List;

public class ApacheCommonsUtil {

    public static List<Integer> iterableToList(final Iterator<Integer> iterator) {
        return IteratorUtils.toList(iterator);

    }

}
