/*
protected:- This modifier is used with classes and their members 
             (functions and properties). A protected element is visible 
             within the defining class and its subclasses. Unlike some 
             other languages, in Kotlin, you cannot access protected members 
             from outside the subclass.

*/



// Niche me a ko prtected bna rhe hai 
open class Father8{
    // Properties
    protected var a:Int = 11 // Yha a ko protected bna rhe hai 
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

class Son8:Father8(){
    // Properties
    var bike:String = "KS 201"


    // Member function

    fun show(){

        println("A using in Son class :- $a") // a ko yha access kr skte hai because ye protected hai 
        println("B using in Son class :- $b")
        println("C using in Son class :- $c")
        println("D using in Son class :- $d")
        println("E using in Son class :- $e")
        hello()

    }
}

fun main(){
    val s1 =Son8()
    s1.disp()
    s1.show()
    
    // s1.a=1 >>> a ko yha nhi use kr skte hai because ye protected hai
    s1.b=2
    s1.c=3
    s1.d=4
    s1.e=5
    s1.disp()
}



/*
>>> Kisi property ya function ko protected bna rhe hai iska matlb 
    hai isko wahi use krega jo base class(Father8) ko inheraite(Son8)
    krega 
>>> Yha a ko kewal Son8 class me hi use kr skte hai or khi nhi use kr skte hai 
>>> Yha a ko main function me v use nhi kr skte hai
>>> a ko Father8 class ke object bna kr v main function me access nhi kr skte hai 
    because of protected
*/