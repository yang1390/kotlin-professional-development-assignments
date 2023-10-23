package nl.freshminds

/**
 * 1. Create a new data class [Pizza] with a few properties like [name], [size], [toppings], and [price].
 *
 * 2. Implement a companion object within the Pizza class that contains several factory methods for
 * creating different types of pizzas.
 *
 * Implement a factory method createCheesePizza() that creates a cheese pizza and returns it.
 * Implement a factory method createPepperoniPizza() that creates a pepperoni pizza and returns it.
 * Implement a factory method createVeggiePizza() that creates a vegetarian pizza and returns it.
 *
 * 3. Test your implementation by creating a few pizzas using each of the factory methods.
 * Verify that the pizzas are created correctly with the appropriate properties.
 *
 * 4. Mark the Pizza constructor as private so all pizza creation goes through the
 * companion object's factory methods.
 */

fun main() {
    val pizzas = listOf(
        Pizza.createPepperoniPizza(),
        Pizza.createCheesePizza(),
        Pizza.createVeggiePizza()
    )
    pizzas.forEach { pizza -> println("${pizza.name} voor ${pizza.price} toppings: ${pizza.toppings}") }
}

data class Pizza private constructor(val name: String, val size: Int, val toppings: String, val price :Double){
    companion object Factory {
        fun createCheesePizza(): Pizza = Pizza("cheese", 2, "kaas", 10.0 )
        fun createPepperoniPizza(): Pizza = Pizza("salami", 3, "salami", 11.0)
        fun createVeggiePizza(): Pizza = Pizza("sadness", 1, "niks", 99.0)
    }
}
