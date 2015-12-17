package com.company;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FirstAppTest {

    @Test
    public void firstAppMethod() {
        FirstApp firstApp = new FirstApp();
        assertTrue(firstApp.getValue());
    }
}