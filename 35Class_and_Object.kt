/*
Class:

    >>> A class is a blueprint or template for
        creating objects.
    >>> It defines the properties (attributes)
        and methods (functions) that objects
        of the class will have.
    >>> You can think of a class as a user-defined
         data type.
    >>> Classes in Kotlin are declared using
        the class keyword.
*/

// In real world jo file ka name hota hai wahi class ka name rakhte hai
// Syntax
class Mobile {

    // Properties/Attributes
    var model: String = "lg420"
    var price: Float = 6464.545F

    // Method/Function
    fun display1() {

        println("MOdel:-  $model and price :- $price")
    }
}

fun main() {

    /*
    Object:

        >>> An object is a single instance of
            a class.
        >>> It represents a specific real-world
            entity or concept based on the class
            blueprint.
        >>> Objects allow you to create and
            manipulate data based on the
            class definition.
        >>> In Kotlin, you can create an object
            directly from a class definition using
            the object keyword.
        */

    // Syntax

    val lg = Mobile() // Creating object
    lg.display1()

    val Realme = Mobile() // Creating another object
    Realme.model = "ab303c" // Modify class properties for this(Realme) object
    Realme.price = 3665.8634F
    Realme.display1()

    val nokia = Mobile() // Creating another object
    nokia.price = 000.8634F // Modify only one attribute of class for this object(Nokia)
    nokia.display1()

}
