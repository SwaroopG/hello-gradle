package com.poorjar.gradle.hello;

import com.google.common.collect.ImmutableList;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the HelloGradle class.
 */
public class HelloGradleTest {
    @Test
    public void testHelloWorld() {
        Assert.assertEquals("Hello World!", HelloGradle.sayHelloWorld());
    }

    @Test
    public void testGetAllNames() {
        String[] names = {"1", "2", "3", "4"};
        Assert.assertEquals("1+2+3+4", new HelloGradle().getAllNames(ImmutableList.copyOf(names)));
    }
}
