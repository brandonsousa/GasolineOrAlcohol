package com.brandonsousa.gasolineoralcohol.model

class Price() {

    var gasoline: Double = 0.0
    var alcohol: Double = 0.0

    fun calc(): Double {
        return gasoline + alcohol
    }

}