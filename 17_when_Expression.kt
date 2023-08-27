
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
