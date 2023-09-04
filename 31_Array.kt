import java.util.*


fun main() {

    // Many ways to making/creating Array

    // 1) Creating array using arrayOf()
    // Synatx >>>
    // Array bnate hai becouse single datatype ka bhut data store krne ke liye
    // But yha ham datatype defijne nhi kiye hai to alg alg datatype v rakh skte hai

    var sit = arrayOf("ram", "cse", "khana", 'j', 45)
    println(sit) // Iss se hame ye array jha store hua hai uska location mil jta hai

    println(sit[0])
    println(sit[1])
    println(sit[2])
    println(sit[3])
    println(sit[4])

    for (item in sit) {
        println(item)
    }
    
    // Spefic data type array
    
    val sit1 = arrayOf<String>("cse","it","ece","ai","ml")
    println(sit1[0])
    println(sit1[1])
    println(sit1[2])
    println(sit1[3])
    println(sit1[4])
    
    for (item in sit1) {
        println(item)
    }
    
    // Reassign the value 
    sit1[3]="math"
    
    for (item in sit1) {
        println(item)
    }
    
    // Reassign value using set function
    
    sit1.set(3,"science") // Set function me 2 parameter hota hai first index and 2nd value

    
    for (item in sit1) {
        println(item)
    }
    
    // Get value from array
    
    val a = sit1[3]
    println(a)
    
    // get value from array using get function
    
    val  a1= sit1.get(3) // // get function me 1 parameter index
    println(a1)
    
    
    
    // >>> Value ko ham update kr skte hai but koi new value(index) add nhi kr skte hai 
    
    // sit1[5]="ece" >>> Yha ase new value nhi aad hoga ye exception error dega output me 
    // Becouse jb ham array bnate hai to usi time uska size fix ho jta hai
    // Bad me ham uska size increase nhi kr skte hai 
    // This is the diffrence between list and array 
    // list me eak add function hota hai wo array me use nhi hota hai 
    
    // for (item in sit1) { 
    //     println(item)
    // }

    // Loop Array and their Index

    println("Loop Array and their Index")

    for(i in sit1){
        println(i)
    }

    // >>> Printing index in array
    for(i in sit1.indices){ //Array name.indices likhne se index milta hai hamko
        println(i)
    }

    // >>> Agr index of value dono ea sath chiye to 

    for(i in sit1.indices){
        println("On index $i value is ${sit1[i]} ")
    }

    // Printing size of array

    println("Printing size of array sit1 ${sit1.size}")

    // Looping using array size

    for (i in 0..sit1.size-1){
        println("On index $i value is ${sit1[i]} ")
    }
    

    // For each loop

    sit1.forEach {i -> println(i) }









    // 2) Creating array using Array() Constructor


    // >>> Array() Constructor me 2 parameter hota hai 1st size and 2nd value which in lambda function
    // Array() Constructor me hamlog value fanction me dete hai 
    // Array() Constructor ka use hamlog generally user se inpute lene ke liye krte hai



    /*
    
The Array() constructor in Kotlin provides several benefits and use cases:

Dynamic Array Creation: The Array() constructor allows you to create arrays with a dynamic size at 
                        runtime. This can be particularly useful when you don't know the size of the 
                        array in advance and need to determine it based on user input or other runtime 
                        conditions.

Custom Initialization: You can provide a lambda function to initialize the elements of the array based 
                       on custom logic. This flexibility allows you to create arrays with elements that 
                       follow specific patterns, calculations, or user-defined input.

Concise and Readable: The use of the Array() constructor with a lambda function can result in concise 
                      and readable code, especially when you need to create and initialize arrays in a 
                      single statement.

Functional Programming: It aligns with functional programming principles, as you can use functional 
                        constructs like lambdas to define the initialization logic for array elements.

Reduced Boilerplate: It reduces the need for boilerplate code when compared to manually initializing 
                     arrays element by element in a loop.

Type Safety: Arrays created using the Array() constructor are type-safe, meaning they can only hold 
             elements of the specified type, helping to catch type-related errors at compile time.
    */



    var sit2 = Array(5,{i->
        when (i) {
            0 -> "Hello"
            1 -> "World"
            2 -> "Kotlin"
            // 3 -> "Array"
            else -> "Default"
        }
    })



    for(j in sit2){
        println(j)
    }


    val scanner = Scanner(System.`in`)
    println("Enter the size of the array:")
    val size = scanner.nextInt()
    
    // Consume the newline character left by nextInt()
    scanner.nextLine() // Iss se nextInt ke bad buuffer ko vej rha hai wha se inpute lega
    
    // Create an array of the given size and initialize it with user-provided strings
    val customStrings = Array(size) { index ->
        println("Enter a string for element $index:")
        scanner.nextLine()
    }

    // Display the elements of the custom string array
    println("You entered the following strings:")
    for (i in customStrings.indices) {
        println("printing index $i value ${customStrings[i]}")
    }
    
    /* scanner.close() >>> Using scanner.close() is a good practice when you're done 
                           using a Scanner object, especially if it's associated with
                           a system resource like System.in. Closing the Scanner 
                           object is necessary to release any resources it might be 
                           holding and to properly clean up*/






    
    // 3) Creating array useing Built-in Methods 

    val sit3 = intArrayOf(12,32,54,65,76,76,67)
    for(i in sit3){
        println(i)
    }

    val sit4 = charArrayOf('m','l','d','t','y')
    for(i in sit4){
        println(i)
    }
    
    // Iss trh se hi short or long v hota hai 
    
    
    // Copy one array to another array
    
    
    
    val sit5 = arrayOf<String>("cse","it","ece","ai","ml")
    for(i in sit5){
        println("printing array sit5 $i")
    }
    
    val sit6 = sit5.copyOf()
    
    for(i in sit6){
        println("printing array sit6 $i")
    }



    // Taking user inpute in array 

   print("Enter no of student ")
   val num = readLine()!!.toInt()
   println("Enter student name")
   var student = Array(num,{readLine()!!})
   // var student = Array(num){readLine()!!} >>> Uper wale ko ase v likh skte hai 

   for(i in student){
    println("Name is $i")
   }


 
    




}
 