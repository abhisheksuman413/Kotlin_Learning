
// CPP me Switch Case use krte hai wahi hai ye 
fun main() {
    print("Enter your day no ")
    val sit = readLine()!!.toInt()

    when (sit) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunaday")
        else -> {
            println("No is not valid ")
        }
    }

    // Syntax for Do value ke liye same code run ho

    when (sit) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6, 7 -> println("Holiday")
        else -> {
            println("No is not valid ")
        }
    }

    // Syntax for eak value ke liye muiltiple/multiline code run ho
    when (sit) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6, 7 -> {
            println("Holiday")
            println(" no working day") // >>> { } >>> Ye bolck bna deta hai jiske andr ka pura code run hota hai
        }
        else -> {
            println("No is not valid ")
        }
    }



    // Range kya hota hai
    println("yha hamlog ragne ke code ko print kr rhe hai") 

    val number =5;
    // yha hamlog cheack kr rhe hai ye number 1 to 5 ke bich me aata hai ya nhi
    val result = number in 1 ..5 // 1,2,3,4,5 >>> yha upper bound include hota hai 
    println(result)
    val resultt= number in 1 until 5 // 1,2,3,4 >>> Yha upper bound include nhi hota hai 
    println(resultt)
    /*
    >>> Difference between .. and until is .. me upper bound include hota hai but in until
        isme upper bound include nhi hota hai
    >>> Range me hamlog in keyword ka use krte hai 
    */




    // Syntax for range value ke liye same code run ho 

    when(sit){
        in 1..5 -> println("working day")
        6, 7 -> {
            println("Holiday")
            println(" no working day")
        }
        else -> {
            println("No is not valid ")
        }
    }
    

}
