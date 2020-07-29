package com.demoblaze;

import com.demoblaze.base.TestSetup;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends TestSetup {

    @Test
    public void testHome(){
        System.out.println("Inside Test");
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(true);
    }
}
