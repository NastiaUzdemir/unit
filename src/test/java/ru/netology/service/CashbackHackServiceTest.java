package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        // проверка, когда сумма равна 1000
        int amount = 1000;
        int expectedRemain = 0;
        int actualRemain = service.remain(amount);

        Assert.assertEquals(expectedRemain, actualRemain);

        // проверка, когда сумма больше 1000
        amount = 1500;
        expectedRemain = 500;
        actualRemain = service.remain(amount);

        Assert.assertEquals(expectedRemain, actualRemain);

        // проверка, когда сумма меньше 1000
        amount = 500;
        expectedRemain = 500;
        actualRemain = service.remain(amount);

        Assert.assertEquals(expectedRemain, actualRemain);


    }
}
