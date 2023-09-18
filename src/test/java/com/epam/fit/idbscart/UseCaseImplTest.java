package com.epam.fit.idbscart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UseCaseImplTest {

        private UseCaseImpl useCase;

        @BeforeEach
        public void setUp() {
            useCase = new UseCaseImpl();
        }

        @Test
        public void testCanReachEnd_TrueScenario1() {
            int[] input = {2,3,1,1,4};
            assertTrue(useCase.execute(input));
        }

        @Test
        public void testCanReachEnd_FalseScenario1() {
            int[] input = {3,2,1,0,4};
            assertFalse(useCase.execute(input));
        }

        @Test
        public void testCanReachEnd_SingleElementArray() {
            int[] input = {0};
            assertTrue(useCase.execute(input));
        }

        @Test
        public void testCanReachEnd_ZerosInMiddle() {
            int[] input = {2,3,0,0,4,1};
            assertTrue(useCase.execute(input));
        }

        @Test
        public void testCanReachEnd_MultiplePossiblePaths() {
            int[] input = {2,1,3,2,0,0,4};
            assertFalse(useCase.execute(input));
        }




}