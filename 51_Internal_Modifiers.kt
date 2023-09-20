/*
internal:- An internal element is visible within the same module. 
             A module in Kotlin is a set of Kotlin files compiled 
             together. This visibility modifier allows you to hide 
             the implementation details of your module while making 
             them accessible to other code within the same module.


*/


// Niche me a ko internal bna rhe hai
open class Father9{
    // Properties
    internal var a:Int = 11 // Yha a ko internal bna rhe hai 
    var b:Int = 32
    var c:Int = 67
    var d:Int = 112
    var e:Int = 3

    // Member function 
    fun disp(){
        println("A :- $a")
        println("B :- $b")
        println("C :- $c")
        println("D :- $d")
        println("E :- $e")
    }

    fun hello(){
        println("Hello Father")
    }
}

class Son9:Father9(){
    // Properties
    var bike:String = "KS 201"


    // Member function

    fun show(){

        println("A using in Son class :- $a") // a ko yha v use kr skte hai
        println("B using in Son class :- $b")
        println("C using in Son class :- $c")
        println("D using in Son class :- $d")
        println("E using in Son class :- $e")
        hello()

    }
}

fun main(){
    val s1 =Son9()
    s1.disp()
    s1.show()
    
    s1.a=1 // a ko yha v use kr skte hai
    s1.b=2
    s1.c=3
    s1.d=4
    s1.e=5
    s1.disp()
}


/*
>>> Kisi properties ya function ko internal bna rhe hai to usko
    within module hi use kr skte hai 
>>> Within module ka matlb hai usko kewal 51_Internal_Modifiers.kt me 
    khi v use kr skte hai 
>>> Iss module ke bhar nhi use kr skte hai 
>>> Iske bare me details me aage janege 
*/