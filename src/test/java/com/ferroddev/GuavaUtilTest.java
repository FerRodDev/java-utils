package com.ferroddev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

class GuavaUtilTest {

    @Test
    void guavaUtil_iterableToList_expectedOk() {

        final List<Integer> result = GuavaUtil.iterableToList(Arrays.asList(1, 2, 3).iterator());
        assertThat(result, containsInAnyOrder(1, 2, 3));

    }


}