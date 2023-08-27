fun main() {
    /* >>> if Expression :- if is an expression
    :- it returns a value  */

    
    /*
    Synatax >>>

        if(condation){
            // code
        }
    */

    // Example >>>

    if (10 > 5) {
        println("Condation in if statement is true ")
    }
    // Niche wala print nhi hoga becouse condation in if expression is false
    if (10 < 5) {
        println("Condation in if statement is true ")
    }

    val a = 10
    val b = 5
    var max = 0

    if (a > b) {
        max = a
    }
    println(max)
}
