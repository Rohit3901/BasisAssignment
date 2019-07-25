package com.example.basisassignment.utils

import org.junit.Assert
import org.junit.Test

class UtilsTest {

    @Test
    fun givenCurrentAndTotal_findPercentage(){
        val current = 5
        val length = 9
        val percentage = Common().calculatePercentage(current,length)
        Assert.assertEquals(60,percentage)
    }

}