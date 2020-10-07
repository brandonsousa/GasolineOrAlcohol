package com.brandonsousa.gasolineoralcohol

import com.brandonsousa.gasolineoralcohol.model.Price
import org.junit.Assert
import org.junit.Test

class PriceUnitTest {

    @Test
    fun best_gas() {
        val price = Price()
        price.gasoline = 3.56
        price.alcohol = 3.14
        Assert.assertEquals("Abasteça com gasolina", price.calc())
    }

    @Test
    fun best_alcohol() {
        val price = Price()
        price.gasoline = 3.69
        price.alcohol = 2.52
        Assert.assertEquals("Abasteça com álcool", price.calc())
    }

    @Test
    fun error(){
        val price = Price()
        price.gasoline = 3.69
        price.alcohol = 2.52
        price.calc()
    }
}