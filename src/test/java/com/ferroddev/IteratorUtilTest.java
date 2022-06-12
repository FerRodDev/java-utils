package com.ferroddev;

import com.ferroddev.guava.IteratorUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

class IteratorUtilTest {

    @Test
    void iteratorUtil_toList_expectedOk() {

        final List<Integer> result = IteratorUtil.toList(Arrays.asList(1, 2, 3).iterator());
        assertThat(result, containsInAnyOrder(1, 2, 3));

    }


}