package com.ferroddev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

class ApacheCommonsUtilTest {

    @Test
    void apacheCommonsUtil_iteratorToList_expectedOk() {

        final List<Integer> result = ApacheCommonsUtil.iteratorToList(Arrays.asList(1, 2, 3).iterator());
        assertThat(result, containsInAnyOrder(1, 2, 3));

    }


}