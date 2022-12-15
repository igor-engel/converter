package org.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    DigitConverter converter = new DigitConverterImpl();

    @Test
    public void intConverterTest() {

        Assert.assertNotNull(converter);

        Assert.assertEquals("101", converter.convert(5, 2));
        Assert.assertEquals("12", converter.convert(5, 3));
        Assert.assertEquals("10", converter.convert(5, 5));
        Assert.assertEquals("0", converter.convert(0, 2));
    }

    @Test
    public void doubleConverterTest() {

        Assert.assertNotNull(converter);

        Assert.assertEquals("0.10000", converter.convert(0.5, 2, 5));
        Assert.assertEquals("0.01", converter.convert(0.25, 2, 2));
    }
}
