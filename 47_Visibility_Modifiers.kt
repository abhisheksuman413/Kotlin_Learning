/*

>>>   Visibility Modifiers   <<<

In Kotlin, visibility modifiers are used to control the visibility
or accessibility of classes, functions, properties, and other 
elements within your code. Kotlin provides four visibility 
modifiers:

1) public: This is the default visibility modifier if no other 
           modifier is specified. It means that the element is 
           visible everywhere in your code, both inside and 
           outside the defining module or package.

2) internal: An internal element is visible within the same module. 
             A module in Kotlin is a set of Kotlin files compiled 
             together. This visibility modifier allows you to hide 
             the implementation details of your module while making 
             them accessible to other code within the same module.

3) protected: This modifier is used with classes and their members 
             (functions and properties). A protected element is visible 
             within the defining class and its subclasses. Unlike some 
             other languages, in Kotlin, you cannot access protected members 
             from outside the subclass.

4) private: The private modifier restricts visibility to the enclosing 
            class or function. It means the element is only visible 
            within the scope it is defined in and cannot be accessed 
            from outside that scope.
*/

open class Father6{
    // Properties
    var a:Int = 11
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

        println("A :- $a")
        println("B :- $b")
        println("C :- $c")
        println("D :- $d")
        println("E :- $e")
        hello()

    }
}

fun main(){
    val s1 =Son6()
    s1.show()
    s1.disp()

    s1.a=1
    s1.b=2
    s1.c=3
    s1.d=4
    s1.e=5
}
