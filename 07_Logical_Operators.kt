fun main(){
    var a = 30
    var b = 20
    var c = 10

    // And operator me (&&)
    // >>> koi eak statement(operant) false hoga to false print hoga 
    // >>> Dono statement(operant) true hoga tb hi true print hoga
    println("Printing and operator")
    println( (a>b) && (b>c) ) // And operator   >>> Print true
    println( (a>b ) && (b<c)) //>>> Print false(becouse of c is not greator than b)
    
    // Or operator (||)
    // >>> Isme koi eak statement(operant) true hoga to true print hoga
    // >>> Isme dono statement(operant) false hoga tb hi false print hoga
    println("Printing or operator")
    println( (a>b) || (b<c) ) 
    println( (a<b ) || (b<c)) 
    // short-circuit in kotlin using or operator
    println(" Printing short-circuit ")
    val result = a== 30 || b++ ==20 // Yha b ka value increament nhi hoga becouse 1st condation hi true hai 
    println(a)
    println(b)
    val resultt = a== 9|| b++ ==20 // Yha b ka value update ho jyega beacuse 1st condation false hai 
    println(a)
    println(b)
    /*
    >>> Or operator me koi eak condation true ho jata hai to next code(uske aage ka ) execute nhi hota hai 
    >>> Isi process ko short-circuit bolte hai 
    >>> 1st wale result me b ka value update nhi hua because wha a==30 hai jo ki true hai isliye 
        next ka code execute hi nhi hua 
    >>> 2nd wala resultt me b ka value update hua because wha a==9 hai jo ki false hai isliye 
        next ka code execute hua 
    >>> ye short-circuit same kam krta hai and operator(&&) me v 
    */


    
    // Not operator
    // Print true if statement is wrong
    // Print false if statement is correct
    println("Printing not operator")
    println( !(a<b)) 
    println( !(a>b)) 
    
}