package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SQRServiceTest {

    @Test
    public void testCalcToFindSquares() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testCalcToFindASquare() {
        SQRService service = new SQRService();

        int actual = service.calc(225, 225);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalcToFindNoSquares() {
        SQRService service = new SQRService();

        int actual = service.calc(1, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}