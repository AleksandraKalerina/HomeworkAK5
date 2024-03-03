package ru.netology.javaqa.homeworkAK5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RestServiceTest {

    @Test
    public void testRest() {
        RestService service = new RestService();
        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testRest2() {
        RestService service = new RestService();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);

    }
}
