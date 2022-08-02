package com.kwri.auto.platform.ui_parallel_prototype.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * JUnit5 sample test independent of Cucumber. Temporarily added to confirm JUnit5 is working.
 *
 * NOTE: tests can be run directly in IntelliJ.
 * TODO: These tests are excluded from pipeline runs at the moment.
 */
@Execution(ExecutionMode.CONCURRENT)
public class CalculatorTest {

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // skipped ...
    }

    @Test
    void succeedingTest() {
        assertEquals(42, Math.multiplyExact(6, 7));
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"), "abc does not contain Z");
        // aborted ...
    }

    @Test
    void failingTest() {
        // The following throws an ArithmeticException: "/ by zero" by design. This test is intended to fail.
        Math.floorDiv(1, 0);
    }

}