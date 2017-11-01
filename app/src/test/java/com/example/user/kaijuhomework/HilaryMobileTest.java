package com.example.user.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/11/2017.
 */

public class HilaryMobileTest {

    HilaryMobile hilaryMobile;
    Godzilla godzilla;

    @Before
    public void before() {
        hilaryMobile = new HilaryMobile("Lasers", 1000);
        godzilla = new Godzilla("Timothy", 100, 20);
    }

    @Test
    public void hasType() {
        assertEquals("Lasers", hilaryMobile.type);
    }

    @Test
    public void hasHealthValue() {
        assertEquals(1000, hilaryMobile.healthValue);
    }

    @Test
    public void isDamaged() {
        hilaryMobile.takesDamage(godzilla.getAttackValue());
        assertEquals(980, hilaryMobile.getHealthValue());
    }
}

