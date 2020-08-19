package com.alifoune.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturn1IfNumberIs1() {
        assertEquals("1", fizzBuzz.generate(1));
    }

    @Test
    public void shouldReturn2IfNumberIs2() {
        assertEquals("2", fizzBuzz.generate(2));
    }

    @Test
    public void shouldReturnFizzIfNumberIs3() {
        assertEquals("Fizz", fizzBuzz.generate(3));
    }

    @Test
    public void shouldReturnFizzIfNumberIs6(){
        assertEquals("Fizz", fizzBuzz.generate(6));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs5(){
        assertEquals("Buzz", fizzBuzz.generate(5));
    }

    @Test
    public void shouldReturnBuzzIfNumberIsTen(){
        assertEquals("Buzz", fizzBuzz.generate(10));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs15(){
        assertEquals("FizzBuzz", fizzBuzz.generate(15));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs30(){
        assertEquals("FizzBuzz", fizzBuzz.generate(30));
    }

}