package com.decagon;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    @Test
    public void test_JUnit() {
        Person principal = new Person("String id", "String staffRooom ");
        principal.teachCourse();
        assertEquals("");
    }
}