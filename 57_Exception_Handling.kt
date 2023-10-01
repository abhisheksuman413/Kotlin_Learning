//   *****Exception Handling*****

fun main(){


    // Try ke andr wase code ko likhte hai jisme exception throw ho skta hai 
    // Try block me tb tak code execute hoga jb tak exception occure nhi hua hai 
    // Exception hone ke bad try block se sidha catch block me chla jyega 
    // Syntax :-

    val result = try{

        println("Before exception occure") // Execute hoga 
        val a = 10/0 // Yha exception throw hoga 
        println("After exception occure") //Execute nhi hoga
        
        a // Last code return krta hai value ko kisi block me 
    }

    // Agr code me koi exception aayega to catch block me aa jyega 
    // Agr exception occure nhi hoga to catch block run nhi krega 
    // but finally bolck execute hoga hi 
    
    catch(e:Exception){
        println("catch block executed ")
        e.message
        0 // Yha 0 return hoga agr exception occure hua to
    }


    //finally block execute hoga hi exception occure ho ya nhi ho ye exceute hoga
    // Agr finally block ka use krte hai to catch block optional ho jta hai
    finally{ 
        println("finally block executed ")

    }

    println("Printing result :- $result") // Agr exception throw nhi hoga to result yha print ho jyega 
    
}




// Any error that occure in runtime is called exception 
// We can create own custom exception class



/*
1) Throwing Exceptions:- To throw an exception, you use the throw keyword 
                         followed by an instance of a subclass of the Throwable 
                         class (or a subclass thereof).

2) Catching Exceptions:- To catch exceptions, you use a try block followed by one 
                         or more catch blocks.
                     >>> Each catch block specifies the type of exception it can handle 
                         and a variable to hold the exception object.

3) Multiple Catch Blocks:- You can have multiple catch blocks to handle different types of 
                           exceptions.

4) The finally Block:- The finally block is optional, and it contains code that will 
                       always execute, whether or not an exception occurred. It's often 
                       used for resource cleanup (e.g., closing files or network 
                       connections).

5) Custom Exceptions:- You can create your own custom exception classes by defining a class 
                       that inherits from Exception or any other exception type.

6) Exception Propagation:-If an exception is thrown and not caught in a function, it will 
                          propagate up the call stack until it's caught or the program 
                          terminates.

>>> Keep in mind that while exception handling is a powerful tool for handling errors, 
    it's best to use it for exceptional situations and not for regular program flow. 
    Handling exceptions can introduce performance overhead, so it's important to strike 
    a balance between robust error handling and code efficiency.




>>>   Multiple catch block code   <<<


fun main() {
    try {
        val result = divide(10, 0)
        println("Result: $result")
    } catch (e: ArithmeticException) {
        // Handle arithmetic exceptions (division by zero)
        println("ArithmeticException: ${e.message}")
    } catch (e: NullPointerException) {
        // Handle null pointer exceptions
        println("NullPointerException: ${e.message}")
    } catch (e: Exception) {
        // Handle other types of exceptions
        println("Exception: ${e.message}")
    }
}

fun divide(a: Int, b: Int): Int {
    return a / b
}


*/