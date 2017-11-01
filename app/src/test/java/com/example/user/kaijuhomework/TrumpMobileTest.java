package com.example.user.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/11/2017.
 */

public class TrumpMobileTest {

    TrumpMobile trumpMobile;
    Godzilla godzilla;

    @Before
    public void before() {
        trumpMobile = new TrumpMobile("WigShooter", 1000);
        godzilla = new Godzilla("Timothy", 100, 20);
    }

    @Test
    public void hasType() {
        assertEquals("WigShooter", trumpMobile.type);
    }

    @Test
    public void hasHealthValue() {
        assertEquals(1000, trumpMobile.healthValue);
    }

    @Test
    public void isDamaged() {
        trumpMobile.takesDamage(godzilla.getAttackValue());
        assertEquals(980, trumpMobile.getHealthValue());
    }
}
