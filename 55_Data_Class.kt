//   *****Data Class*****
// We need data class to create a class solely to hold data
// Data class kewal data hold krne ka kam aata hai 



// Syntax :-

data class Employee(val name:String , val age :Int ) // Yhai kewal syntax hai data class ka 
                                                    // Employee class eak data class hai 

fun main(){
    val emp = Employee("Sonam",25)
    println(emp.name)
    println("Name :- ${emp.name}")
    println("Age :- ${emp.age}")
    println("Printing emp obj :- $emp")

    // Special method in data class

    println("String representation of obj emp :- ${emp.toString()}") // Iss se object ka string representation milta hai
    
    
    // Destructuring 
    // Destructure krne ka matlb hai uss object ke properties ko by name se access kr skte hai 
    // Bina object.properties_name likhe hue 
    val(name,age) =emp
    println("Name :- ${name}")
    println("Age :- ${age}")

    // Dusre object ke liye 
    val emp1 = Employee("Sonam1",251)
    val(name1,age1) =emp1
    println("Name :- ${name1}")
    println("Age :- ${age1}")

}


/*
In Kotlin, a data class is a special class that is primarily 
used to hold data. It's often used for modeling simple, 
immutable data structures where you need to store and 
retrieve data without the need for extensive methods or 
behavior. Kotlin provides a concise and convenient way to 
declare data classes.

Here are the characteristics and features of a Kotlin data class:

1) Automatic Generation of Useful Methods: When you declare a 
   data class, Kotlin automatically generates several useful 
   methods for you, including equals(), hashCode(), toString(), 
   and copy(). These methods make it easy to work with data 
   and compare objects.

2) Component Functions: Data classes automatically generate component 
                        functions, which allow you to destructure instances 
                        of the class into their individual properties. 
                        This is handy when you want to work with the 
                        properties directly.

3) Immutable Properties: Data class properties are typically declared as 
                         val (immutable), making instances of data classes 
                         immutable by default.

4) Primary Constructor: Data classes must have a primary constructor with 
                        at least one parameter. The primary constructor 
                        defines the properties of the data class.


*/
