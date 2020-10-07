package com.brandonsousa.gasolineoralcohol.model

class Price {

    var gasoline: Double? = null
    var alcohol: Double? = null

    fun calc(): String? {
        if (alcohol?.equals(null)!! || gasoline?.equals(null)!!) {
            throw IllegalArgumentException("Preencha ambos os campos")
        }
        if (alcohol?.div(gasoline!!)!! < 0.7) {
            return "Abasteça com álcool"
        }
        return "Abasteça com gasolina"
    }

}