package com.innolab.testservice.rest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalcControllerTest {

    CalcController sut;

    @BeforeEach
    void setup() {
        sut = new CalcController();
    }

    @Test
    void test01() {
        String methods = sut.getMethods();

        assertThat(methods).isEqualTo("addition; subtraction; kill");
    }

    @Test
    void test02() {
        int addition = sut.getAddition(1, 3);

        assertThat(addition).isEqualTo(4);
    }

    @Test
    void test03() {
        int addition = sut.getSubtraction(15, 3);

        assertThat(addition).isEqualTo(12);
    }

    @Test
    void test04() {
        assertThat(true).isTrue();
    }
}
