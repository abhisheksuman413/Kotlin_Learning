import java.util.*


fun main(){

    val a=10
    val b=11

   display(a,b)


    val total = adding(a,b)
    println(total)
    val total1 = multi(21,10)
    println(total1)
    

    val result = addd(a,b)
    println(result)
    val result1 =addd1(a,b)
    println(result1)
    
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




// Example of inline function (Isko Single line function v bolte hai)

fun addd(nun1:Int , num2:Int):Int = nun1+num2

fun addd1(nun1:Int , num2:Int)= nun1+num2 // To yha se Int v hta diye because hame pta hai ye function Int return krega isliye 
                                         // Ase v likh skte hai single line return function ko 
