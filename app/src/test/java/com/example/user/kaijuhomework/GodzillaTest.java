package com.example.user.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/11/2017.
 */

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void before() {
        godzilla = new Godzilla("Timothy", 100, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Timothy", godzilla.getName());
    }

    @Test
    public void checkHealthValue() {
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void checkAttackValue() {
        assertEquals(20, godzilla.getAttackValue());
    }

    @Test
    public void hasRoar() {
        assertEquals("NEENAW!", godzilla.roar());
    }

    @Test
    public void checkMove() {
        assertEquals("Stomps forward", godzilla.move());
    }
}
