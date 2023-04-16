package com.company;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog;
    @BeforeEach
    void prepareData(){
        dog = new Dog("Albert", 2);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Dog dog = new Dog("Albert", 2);
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Dog dog = new Dog("Albert", 2);
        dog.setName("Roman");
        assertEquals("Albert", dog.getName());
    }
    @org.junit.jupiter.api.Test
    void setNameIfNameIsEmpty() {
        Dog dog = new Dog("", 2);
        dog.setName("Roman");
        assertEquals("Roman", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}