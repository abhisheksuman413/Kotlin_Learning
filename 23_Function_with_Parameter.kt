import java.util.*


fun main(){

    val a=10
    val b=11

   display(a,b)


    val total = adding(a,b)
    println(total)
    val total1 = multi(21,10)
    println(total1)
    
}

// Function with Parameters
/*

fun Function_name(Parameters:Parameters data type ,Parameters:Parameters data type):return type{
    // code
}

*/


// Example
fun display(x:Int , y:Int){
    println("value of X :- $x and Y:- $y")
}

fun adding(x:Int , y:Int):Int{
    println("value of X :- $x and Y:- $y")
    return(x+y)
}
fun multi(x:Int , y:Int):String{
    println("value of X :- $x and Y:- $y")
    return("${x*y}")
}
