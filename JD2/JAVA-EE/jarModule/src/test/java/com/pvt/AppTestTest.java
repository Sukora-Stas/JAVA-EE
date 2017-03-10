package com.pvt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.pvt.App.isValidSum;


/**
 * Created by Sukora Stas.
 */
public class AppTestTest {

    protected final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testValidSum() {
        Assert.assertEquals("Not Valid", true, isValidSum(50));
        Assert.assertEquals("Not Valid", false, isValidSum(51));
    }

    @Test
    public void testString() {
        main m = new main();
        main.sout();
        Assert.assertEquals("Task A from workbook: in a string find all numbers in Java HEX format.\n" +
                "0xAB\n" +
                "0X1111\n" +
                "0xfffff\n" +
                "\n" +
                "Task A, B, C: add parsing commands feature to matlab project, add jUnit tests.\n" +
                "(this is solved in by.it.savelyeva.matlab)\n", output.toString());
    }
}

