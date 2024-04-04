package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat
import kotlin.math.exp

class TipCalculatorTests {
    @Test
    fun calculateTip_20percent_noRoundUp(){
        val amount = 100.0
        val tipPercent = 20.0
        val testresult = calculateTip(amount = amount,tipPercent,false)
        val expectedTip = NumberFormat.getCurrencyInstance().format(20)
        assertEquals(testresult, expectedTip)
    }
}