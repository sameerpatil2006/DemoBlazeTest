package com.demoblaze;

import com.demoblaze.base.TestSetup;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends TestSetup {

    @Test
    public void testHome_1(){
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(true);
    }

    @Test
    public void testHome_2(){
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(true);
    }

    @Test
    public void testHome_3(){
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(false);
    }

    @Test
    public void testHome_4(){
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(true);
    }


    @Test
    public void testHome_5(){
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(false);
    }


    @Test
    public void testHome_6(){
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(true);
    }

    @Test
    public void testHome_7(){
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(false);
    }
}
