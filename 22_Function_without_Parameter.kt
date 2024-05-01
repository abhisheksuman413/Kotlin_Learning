fun main(){
    

    // Niche jo function bnaye hai usko call kr rhe hai 
    display()
    display1()
    val total = adding()
    println(total)
    val total1 =multi()
    println(total1)

}

/*  
    Function :- In kotlin function are declared using the fun keyword
             :- Function me hamlog kuch set of statement likhte hai 
                jise bar bar krna hota hai or fir jha pe uss set of
                instruction ko use krna hota hai wha uss function ko 
                call kr lete hai 
             :- Iss se DRY principal follow hota hai
             :- Main v eak function hi hai jha se sbse phle code run hona 
                start hota hai  
             :- Function ko main ke andr ya bahr khi v bna(define) skte hai  
                function ka code execution wha pe start hota hai jha usse call
                krte hai
    */
    


// Function without Parameter
// Syntax
/* 

    fun Function_name(){
        // code
    }

*/

// Example 
// Yha function ko define kr rhe hai
// Default return type unit hota hai 
// Agr function kuch nhi return kr rha hai to uska return type unit hota hai 
fun display(){   // >>> Yha return type unit hai
    println("Hello Kotlin")
}
// Unit ko likh v skte hai ya nhi v error nhi aayega 
fun display1():Unit{   // >>> Yha return type unit hai
    println("Hello Kotlin")
}

// Function with return type
// Return type define krne ka syntax
fun adding(): Int{ // Yha return type int hai
    val a = 10
    val b = 21
    return(a+b) 
}
fun multi(): String{ // Yha return type int hai
    val a = 10
    val b = 21
    return("${a*b}") 
}

