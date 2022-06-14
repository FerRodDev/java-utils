package com.ferroddev;

import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.List;

public class ApacheCommonsUtil {

    public static List<Integer> iteratorToList(final Iterator<Integer> iterator) {
        return IteratorUtils.toList(iterator);

    }

    static String removeAccent(final String val) {
        return StringUtils.stripAccents(val);
    }

}
