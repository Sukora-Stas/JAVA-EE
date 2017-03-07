package com.pvt.app;

import org.junit.Assert;
import org.junit.Test;

import static com.pvt.app.App.isValidSum;



/**
 * Created by Sukora Stas.
 */
public class AppTestTest {
    @Test
    public void testValidSum() {
        Assert.assertEquals("Not Valid", true, isValidSum(50));
        Assert.assertEquals("Not Valid", false, isValidSum(51));
    }


}