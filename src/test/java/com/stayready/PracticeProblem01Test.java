package com.stayready;
import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {

    PracticeProblem01 practiceProblem01=new PracticeProblem01();

    @Test
    public void isPalindromeTrue() {
        boolean expected = true;
        boolean actual = practiceProblem01.isPalindrome("madam"); //returns true
        Assert.assertTrue(actual);
    }

    @Test
    public void isPalindromeFalse() {
        boolean expected = false;
        boolean actual = practiceProblem01.isPalindrome("rats"); //returns true
        Assert.assertFalse(actual);
    }

/*
    public void getSubPalindrome(){
        String expected= "r a c e c a r";
        String actual= practiceProblem01.getSubPalindrome();
        Assert.assertEquals(expected, actual);
    }*/
}