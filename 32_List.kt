fun main() {

    /* List :-In Kotlin, a list is a commonly used collection type that represents an
                 ordered collection of elements. Lists are similar to arrays in other
                 programming languages, but they offer more flexibility and functionality.
                 Here are some key characteristics of lists in Kotlin:

    1. **Ordered Collection:** Lists maintain the order of elements in which they were added
         You can access elements by their index, and the first element is at index 0, the
         second at index 1, and so on.

    2. **Immutable vs. Mutable Lists:**
       - **Immutable List:** In Kotlin, you can create an immutable (read-only) list using
                     the `listOf()` function. Once created, you cannot add, remove, or
                     modify elements in an immutable list.
       - **Mutable List:** To create a mutable list that allows you to add, remove, and modify
                           elements, you can use the `mutableListOf()` function or other
                           mutable list types like `ArrayList` or `MutableList`.
    
    >>> List ka size fix nhi hota hai
    >>> Element ka value same do alg index pe same v ho skta hai(duplicate allowed hai)
    >>> List me alg alg data type ke value eak sath store kr skte hai                          */

    
    
    
    
    // Creating an immutable list
    val sit = listOf("apple", "banana", "cherry",'r',65)

    // Accessing elements by index 
    val firstFruit = sit[0] // "apple"
    println(firstFruit)
    println(sit[1])

    println(sit) // Iss trh se v pura list print/access ho jyega array me nhi hota hai
                // Iska value [] me aayega
               // Bina index ke print/access krna v possible hai pura list
    
    // sit.add("orange") >>> Ye error dega because ye sit Immutable list hai or Immutable list ko modify nhi kr skte hai 
    // Immutable list ko only access / print kr skte hai 

    // Printing by loop
    for (fruit in sit) {
        println(fruit)
    }

    // Get function ke through v print/access kr skte hai
    println(sit.get(2))
    
    // Creating a mutable list
   // Mutable list me v specific data type ka bna skte hai 
    val sit1 = mutableListOf("apple", "banana", "cherry","siliguri")
    
    // Adding elements to a mutable list
    sit1.add(2,"orange")
    
    // Removing an element
    sit1.remove("banana")
    sit1.removeAt(3) // Remove siliguri 
    
    // Modifying an element
    sit1[0] = "grape"
    
    
    // Printing by loop
    for (fruit in sit1) {
        println(fruit)
    }

    // Printing Size
    println("Size of list sit :- ${sit.size}")

    // Printing index

    for(i in sit.indices){
        println("Printing sit index no :- $i")
    }


    // Printing by for each loop 
    
    sit.forEach {i -> println("Printing by for each loop :- $i") }



    // Specific data type list syntax 
    val sit2 = listOf<String>("apple", "banana", "cherry")
    for(i in sit2){
        println("Printing sit2 elment :- $i")
    }



    // Taking user inpute in array 

   print("Enter no of student ")
   val num = readLine()!!.toInt()
   println("Enter student name")
   var student = List<String>(num,{readLine()!!})
   // var student = Array(num){readLine()!!} >>> Uper wale ko ase v likh skte hai 

   for(i in student){
    println("Name is $i")
   }



    // Other function are same as array


}
