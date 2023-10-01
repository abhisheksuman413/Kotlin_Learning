//   *****Object Destructuring*****


/*
>>> Object destructuring is a feature in Kotlin that allows 
    you to break down an object into its individual components 
    (properties) and assign them to separate variables in a 
    concise and readable way. This can be particularly useful 
    when you want to extract values from data classes, tuples, 
    or other objects.

>>> In Kotlin, you can perform object destructuring in two main 
    ways: using the componentN() functions and with the data class 
    feature. Let's explore both approaches:

*/

// Data Class Example:-

data class Employee1(val name:String , val age :Int , val car:String )


// componentN() Example:-

/* >>> You can also manually define the componentN() functions for non-data 
       classes to enable object destructuring.*/

/* >>> In Kotlin, to perform object destructuring on a non-data class without 
       using a constructor, you can define custom componentN() functions for 
       the class. These functions provide the values to be destructured when 
       you use object destructuring syntax. Here's an example of how you can 
       achieve this: */

class Employee2{
    val name:String ="Sonam"
    val age:Int=25
    val car:String="Alt 501"

    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = car

}


fun main(){

    val emp1= Employee1("Ajay", 35, "KTM 200")
    println("Name :- ${emp1.name}")
    println("Age :- ${emp1.age}")
    println("Car :- ${emp1.car}")

    // Destructuring 
    // Destructure krne ka matlb hai uss object ke properties ko by name se access kr skte hai 
    // Bina object.properties_name likhe hue 


    // Syntax:-

    val(name,age,car)=emp1

    println("Name after destructuring object :- ${name}")
    println("Age after destructuring object :- ${age}")
    println("Car after destructuring object :- ${car}")


    val emp2 = Employee2()
    println("Name :- ${emp2.name}")
    println("Age :- ${emp2.age}")
    println("Car :- ${emp2.car}")

    // Destructuring 
   // Destructure krne ka matlb hai uss object ke properties ko by name se access kr skte hai 
   // Bina object.properties_name likhe hue 

    // Syntax:-

    val(name1,age1,car1)=emp2 // Dusre object ke liye different name use krna hota hai 
    println("Name after destructuring object :- ${name1}")
    println("Age after destructuring object :- ${age1}")
    println("Car after destructuring object :- ${car1}")
}