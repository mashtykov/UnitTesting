package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Skoda", "ABC-1234", 2019, "Sanal Mashtykov");
    }

    @Test
    void getManufacturer() {
        assertEquals("Skoda", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("ABC-1234", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("ABCD-1234");
        assertEquals("ABCD-1234", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2019, car.getYear());
    }


    @Test
    void getListOfOwners() {
        assertArrayEquals(new String[]{"Sanal Mashtykov"},
                car.getOwners().toArray());
    }

    @Test
    void getListOfTwoOwners() {
        car.setOwner("Danzan Mashtykov");
        assertArrayEquals(new String[]{"Sanal Mashtykov", "Danzan Mashtykov"},
                car.getOwners().toArray());
    }


    @Test
    void getOwner() {
        assertEquals("Sanal Mashtykov", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("Danzan Mashtykov");
        assertEquals("Danzan Mashtykov", car.getOwner());
    }
}