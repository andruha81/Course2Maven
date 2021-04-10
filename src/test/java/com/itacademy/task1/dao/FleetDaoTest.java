package com.itacademy.task1.dao;

import com.itacademy.task1.entities.Aircraft;
import com.itacademy.task1.entities.PassengerAircraft;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FleetDaoTest {
    FleetDao fleet;
    Aircraft passAircraft;

    @Before
    public void createFleetAircraft() {
        fleet = new FleetDao();
        passAircraft = new PassengerAircraft("Test", "test", 1, 1, 1, 1);
    }

    @Test
    public void addAircraftTest() {
        fleet.addAircraft(passAircraft);
        Assert.assertNotEquals(0, fleet.getFleet().size());
    }

    @Test
    public void removeAircraftTest() {
        fleet.addAircraft(passAircraft);
        fleet.removeAircraft(passAircraft);
        Assert.assertEquals(0, fleet.getFleet().size());
    }

    @Test
    public void getFleetTest() {
        Assert.assertNotNull(fleet.getFleet());
    }
}
