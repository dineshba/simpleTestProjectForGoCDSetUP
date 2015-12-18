package com.company;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FirstAppTest {

    @Test
    public void firstAppMethod() {
        FirstApp firstApp = new FirstApp();
        assertTrue(firstApp.getValue());
    }

    @Test
    public void shouldReturnTrue() {
        FirstApp firstApp = new FirstApp();
        assertThat(firstApp.getValue(), is(false));
    }
}