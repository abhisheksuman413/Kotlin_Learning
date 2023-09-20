// public Modifiers 

/*
public: This is the default visibility modifier if no other 
           modifier is specified. It means that the element is 
           visible everywhere in your code, both inside and 
           outside the defining module or package.

*/

// Isme khi se kuch v access kr skte hai

open class Father6{
    // Properties
    public var a:Int = 11
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

class Son6:Father6(){
    // Properties
    var bike:String = "KS 201"


    // Member function

    fun show(){

        println("A using in Son class :- $a")
        println("B using in Son class :- $b")
        println("C using in Son class :- $c")
        println("D using in Son class :- $d")
        println("E using in Son class :- $e")
        hello()

    }
}

fun main(){
    val s1 =Son6()
    s1.disp()
    s1.show()
    
    s1.a=1
    s1.b=2
    s1.c=3
    s1.d=4
    s1.e=5
    s1.disp()
    s1.hello()

}

// Yha sb public hai kisi ko khi v use kr skte hai 
// Agr public nhi v lihte hai to kam chlta hai 
// because by default public hota hai 
// Yha sb properties or function public hai 