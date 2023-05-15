package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun generates_number(){
        val dice = Dice(6)
        val  rollResult = dice.roll()
        assertTrue("The value of the rollResult was not between 1 and 6", rollResult in 1..6)


    }

}