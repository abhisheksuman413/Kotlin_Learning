fun main(){
    val a = 30
    val b = 20
    val c = 10

    // And operator me 
    // >>> koi eak statement(operant) false hoga to false print hoga 
    // >>> Dono statement(operant) true hoga tb hi true print hoga
    println("Printing and operator")
    println( (a>b) && (b>c) ) // And operator   >>> Print true
    println( (a>b ) && (b<c)) //>>> Print false(becouse of c is not greator than b)
    
    // Or operator 
    // >>> Isme koi eak statement(operant) true hoga to true print hoga
    // >>> Isme dono statement(operant) false hoga tb hi false print hoga
    println("Printing or operator")
    println( (a>b) || (b<c) ) 
    println( (a<b ) || (b<c)) 
    
    // Not operator
    // Print true if statement is wrong
    // Print false if statement is correct
    println("Printing not operator")
    println( !(a<b)) 
    println( !(a>b)) 
    
}