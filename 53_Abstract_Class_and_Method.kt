// Abstract Class and Method

//Abstract class hamlog bnate hai because kv kv asa hota hai ki kuch function and properties ase hote hai
// jisko hamlog chahte hai ki child(Son11) class usko use kre hi kre to uss case me abstract class bnate hai 


// Agr kisi calss ko abstract bnana hai to uss class ke aage abstract likhna pdega 
// Jb v koi class abstract banta hai hai to by default wo open hota hai 
// wha pe open likhne ka jarurat hai hota hai 
// Abstract class ka object create nhi hota hai 
// yha hamlog Father11 ka koi object nhi create kr skte hai 
// Abstract class me ham abstract method likh skte hai


abstract class Father11{ // Ab yha open nhi likhne se v ye inherate hoga 
    // Properties
    var car:String= "Alt 1000"
    // Member function

    fun disp(){
        println("Father car :- $car" )
    }


    // Abstract method
    abstract fun hello() // Abstract method ka koi body nhi likhna pdta hai 
                        // isko hamlog child class(Son11) me define krte hai
                       // Jo v Father11 class ko inherate krega uska responsibility
                      // hai iska body likhne ka
}

class Son11:Father11(){

    // Memeber function
    fun show(){
        println("Father car :- $car " )
    }

    // Implementation of Father11 class abstract method

    override fun hello(){ //Jb v abstract method ko implementation krte hai override ka use krna hota hai nhi to error aayega
        println(" Father11 class abstract method Hello")
    }



}

fun main(){
    val s1 = Son11()
    s1.show()
    s1.disp()
    s1.hello()



    // val f1 = Father11() >>> Yha error aayega because Father11 class abstract class hai
                            // or abstract class ka koi object nhi create nhi hota hai
}



/*
Abstract class:- 

An abstract class in Kotlin is a class that cannot be instantiated 
directly and is designed to serve as a blueprint or template for 
other classes. It allows you to define common properties and 
methods that should be shared among its subclasses while leaving 
certain parts of the implementation to be provided by the concrete 
(non-abstract) subclasses.

Here are some key characteristics of abstract classes in Kotlin:

>>> Cannot be Instantiated: You cannot create instances (objects) 
    of an abstract class directly. It exists solely for the purpose 
    of inheritance and acts as a base for other classes.

>>> May Contain Abstract and Concrete Methods: An abstract class 
    can have both abstract (unimplemented) methods and concrete (implemented) 
    methods. Abstract methods are declared using the abstract keyword 
    and do not have a method body, while concrete methods have an i
    mplementation. 

>>> Subclasses Must Implement Abstract Methods: Concrete subclasses 
    that inherit from an abstract class must provide implementations 
    for all the abstract methods declared in the abstract class. 
    This enforces a contract that ensures specific behavior in 
    subclasses.
*/



/*
Abstract method :-

In Kotlin, an abstract method is a method declared in an abstract 
class but without any implementation in the abstract class itself. 
Instead, the implementation of an abstract method is provided by 
concrete subclasses that inherit from the abstract class. Abstract 
methods are declared using the abstract keyword.

Key points about abstract methods in Kotlin:

>>> No Implementation: Abstract methods do not have a body or 
    implementation in the abstract class where they are declared. 
    They only specify the method signature (name, parameters, return 
    type) and any constraints on the method.

>>> Must Be Declared in an Abstract Class: Abstract methods can only 
    exist within abstract classes. Abstract classes are classes marked 
    with the abstract keyword.

>>> Subclasses Must Provide Implementation: Any concrete subclass 
    (i.e., a subclass that can be instantiated) that inherits from 
    an abstract class with abstract methods is required to provide 
    an implementation for those abstract methods. Failure to do so 
    will result in a compilation error.

*/