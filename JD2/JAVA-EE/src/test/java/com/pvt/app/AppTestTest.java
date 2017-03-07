package com.pvt.app;

import org.junit.Assert;
import org.junit.Test;

import static test.App.isValidSum;
import static org.junit.Assert.*;


/**
 * Created by Sukora Stas.
 */
public class AppTestTest {
    @Test
    public void testValidSum() {
        Assert.assertEquals("Not Valid", true, isValidSum(50));
    }

    
}