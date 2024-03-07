package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        // проверка, когда сумма равна 1000
        int amount = 1000;
        int expectedRemain = 0;
        int actualRemain = service.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain, "Некорректное значение остатка в тесте 1");

        // проверка, когда сумма больше 1000
        amount = 1500;
        expectedRemain = 500;
        actualRemain = service.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain, "Некорректное значение остатка в тесте 2");

        // проверка, когда сумма меньше 1000
        amount = 500;
        expectedRemain = 500;
        actualRemain = service.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain, "Некорректное значение остатка в тесте 3");


    }
}
