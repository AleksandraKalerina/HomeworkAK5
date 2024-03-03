package ru.netology.javaqa.homeworkAK5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test.csv")
    public void testRest(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}

