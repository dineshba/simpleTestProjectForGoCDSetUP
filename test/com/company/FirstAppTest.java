package com.company;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FirstAppTest {

    @Test
    public void shouldReturnTrue() {
        FirstApp firstApp = new FirstApp();
        assertThat(firstApp.getValue(), is(true));
    }
}