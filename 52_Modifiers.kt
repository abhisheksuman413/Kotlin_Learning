
// All rules of modifiers are same for properties and function

open class Father10{
    // Properties
    private var a:Int = 11 // Ye private hai
    protected var b:Int = 32 // Ye protected hai
    internal var c:Int = 67 // Ye internal hai
    public var d:Int = 112 // Ye public hai (likhna mandatory nhi hai)
    var e:Int = 3 // Ye v public hi hai

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

class Son10:Father10(){
    // Properties
    var bike:String = "KS 201"


    // Member function

    fun show(){

        // println("A using in Son class :- $a") >>> Not use here because ye private hai
        println("B using in Son class :- $b") // Use here because ye protected hai
        println("C using in Son class :- $c") // Use here because ye internal hai
        println("D using in Son class :- $d") // Use here because ye public hai
        println("E using in Son class :- $e") //Use here because ye v public hai
        hello()

    }
}

fun main(){
    val s1 =Son10()
    s1.disp()
    s1.show()
    
    // s1.a=1 >>> Not use here because ye private hai
    // s1.b=2 >>> Not use here because ye protected hai
    s1.c=3 // Use here because ye internal hai
    s1.d=4 // Use here because ye public hai
    s1.e=5 //Use here because ye v public hai 
    s1.disp()


    val f1 = Father10()
    // f1.a = 21 
    // f1.b=31
    // Uper dono ko Father10 class ke v object bna kr v access nhi kr skte hai 
    // because eak private(a) hai or eak protected(b) hai 

}


/*
In kotlin constructor me v ham modifiers ka use kr skte hai 

// Syntax 


>>> Primary constructor
class Father10 private consatructor(parameters){
    // code
}
>>> Agr primary constructor bnate hai to constructor likhna optional hota hai 
    but visibility modifiers use krna hai to constructor likhna mandiatory ho 
    jata hai 

>>> Secondary constructor

class Father10{

    private constructor(parameters){
        // code
    }
    // code
}


*/