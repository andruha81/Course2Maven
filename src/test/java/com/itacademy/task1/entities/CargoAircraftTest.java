package com.itacademy.task1.entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CargoAircraftTest {
    Aircraft passAircraft;

    @Before
    public void createAircraft() {
        passAircraft = new CargoAircraft("Test", "test", 1, 1, 1);
    }

    @Test
    public void getSeatsNumberTest() {
        Assert.assertEquals(0, passAircraft.getSeatsNumber());
    }

    @Test
    public void getPayloadTest() {
        Assert.assertNotEquals(0, passAircraft.getPayload());
    }

    @Test
    public void getRangeTest() {
        Assert.assertNotEquals(0, passAircraft.getRange());
    }

    @Test
    public void getFuelBurnTest() {
        Assert.assertNotEquals(0, passAircraft.getRange());
    }

    @Test
    public void getTypeTest() {
        Assert.assertNotNull(passAircraft.getType());
    }

    @Test
    public void toStringTest() {
        Assert.assertNotNull(passAircraft.toString());
    }

    @Test
    public void takeoffTest() {
        passAircraft.takeoff();
        Assert.assertTrue(passAircraft.isEnginesWorking);
        Assert.assertTrue(passAircraft.isInFlight);
    }

    @Test
    public void landTest() {
        passAircraft.land();
        Assert.assertFalse(passAircraft.isEnginesWorking);
        Assert.assertFalse(passAircraft.isInFlight);
    }

    @Test
    public void fillingTest() {
        Assert.assertTrue(passAircraft.filling());
    }
}
