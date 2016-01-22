package com.company;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FirstAppTest {

    @Test
    public void shouldReturnTrue() {
        FirstApp firstApp = new FirstApp();
        assertThat(firstApp.getValue(), is(true));
    }
}