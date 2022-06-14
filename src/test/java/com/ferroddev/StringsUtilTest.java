package com.ferroddev;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.Collections;

class StringsUtilTest {

    @Test
    public void apacheCommonsUtil_isBlank_expectedOk() {

        assertThat(StringUtils.isBlank("")).isTrue();
        assertThat(StringUtils.isBlank(" ")).isTrue();
        assertThat(StringUtils.isBlank("  ")).isTrue();

    }

    @Test
    public void apacheCommonsUtil_isEmpty_expectedOk() {
        assertThat(StringUtils.isEmpty("")).isTrue();

    }

    @Test
    public void apacheCommonsUtil_isAllLowerCase_expectedOk() {
        assertThat(StringUtils.isAllLowerCase("hello")).isTrue();
    }

    @Test
    public void apacheCommonsUtil_isAllUpperCase_expectedOk() {
        assertThat(StringUtils.isAllUpperCase("HELLO")).isTrue();
    }

    @Test
    public void apacheCommonsUtil_isMixedCase_expectedOk() {
        assertThat(StringUtils.isMixedCase("Hello")).isTrue();
    }

    @Test
    public void apacheCommonsUtil_isAlpha_expectedOk() {
        assertThat(StringUtils.isAlpha("Hello")).isTrue();
    }

    @Test
    public void apacheCommonsUtil_isAlphanumeric_expectedOk() {
        assertThat(StringUtils.isAlphanumeric("Hello25")).isTrue();
    }


}