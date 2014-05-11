package com.loia;

import org.junit.Assert;
import org.junit.Test;

public class MyControllerTest {

    private MyController controller = new MyController();

    @Test
    public void testGetResource() throws Exception {
        String actual = this.controller.getResourceB();
        Assert.assertEquals("Resource B", actual);
    }
}
