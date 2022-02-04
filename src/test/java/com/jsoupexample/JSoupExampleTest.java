package com.jsoupexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JSoupExampleTest {

    @Test
    public void testGetWebContent() {
        JSoupExample js = new JSoupExample();
        String webContent = js.getWebContent("https://www.google.com");
        assertEquals("Google", webContent);
    }
}