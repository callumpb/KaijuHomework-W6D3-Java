package com.example.user.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/11/2017.
 */

public class MargaretTest {

    Margaret margaret;

    @Before
    public void before() { margaret = new Margaret("Marge", 100, 50);

    }

    @Test
    public void hasName() {
        assertEquals("Marge", margaret.getName());
    }

    @Test
    public void checkHealthValue() {
        assertEquals(100, margaret.getHealthValue());
    }

    @Test
    public void checkAttackValue() {
        assertEquals(50, margaret.getAttackValue());
    }

    @Test
    public void hasRoar() {
        assertEquals("cool!", margaret.roar());
    }

    @Test
    public void checkmove() {
        assertEquals("Flaps wings, flies forward", margaret.move());
    }
}

